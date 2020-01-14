package scalax

import java.io.{FileOutputStream, OutputStreamWriter}

import scala.util.Using

/**
  * Copyright xmaples
  * Licensed under Apache License 2.0
  * (http://www.apache.org/licenses/LICENSE-2.0).
  */
object TupleOpsSourceCodeGenerator {

  final val MaxBuiltInTuple = 22

  def main(args: Array[String]): Unit = {

    Using.resource(new OutputStreamWriter(new FileOutputStream("src/main/scala/scalax/TupleOps.scala"),"utf8")){writer=>
      writer.write{
        """package scalax
          |
          |import scala.reflect.ClassTag
          |
          |/**
          |  * Copyright xmaples
          |  * Licensed under Apache License 2.0
          |  * (http://www.apache.org/licenses/LICENSE-2.0).
          |  */
          |object TupleOps {
          |""".stripMargin
      }

      writer.write("  /*==================== Generic Tuple Ops =================*/\n")
      writer.write(genericTupleOps().mkString("\n"))
      writer.write("\n\n  /*==================== Homogeneous Tuple Ops =================*/\n")
      writer.write(homogeneousTupleOps().mkString("\n"))
      writer.write("\n\n  /*==================== Tuple of Tuple Ops =================*/\n")
      writer.write(tupleOfTupleOps().mkString("\n"))

      writer.write("\n}\n")
    }
  }

  def tupleFromTo(to: Int, prefix: String = "T", from: Int = 1, step: Int = 1): String = tupleNFromSeq(Range.inclusive(from, to, step), prefix)

  def tupleN(n: Int, prefix: String = "T", from: Int = 1, asc: Boolean = true): String = {
    val step = if (asc) 1 else -1
    tupleNFromSeq(Range(from, from + scala.math.signum(step) * n, step), prefix)
  }

  def tupleNFromSeq(tpNums: Seq[Int], prefix: String): String = tupleNFromSeq(tpNums.map(prefix + _))

  def tupleNFromSeq(tpNames: Seq[String]): String = if (tpNames.length == 1) s"Tuple1[${tpNames.head}]" else s"(${tpNames.mkString(",")})"

  def homoTupleN(n:Int, tp:String="T"):String= tupleNFromSeq(List.fill(n)(tp))

  def typeIComma(to: Int, prefix: String = "T", from: Int = 1, step: Int = 1): String = Range.inclusive(from, to, step).map(prefix + _).mkString(",")

  def dotISeq(to: Int, v: String = "self", from: Int = 1, step: Int = 1): Seq[String] = Range.inclusive(from, to, step).map(v + "._" + _)

  def dotIComma(to: Int, v: String = "self", from: Int = 1, step: Int = 1): String = dotISeq(from = from, to = to, step = step, v = v).mkString(",")

  def createTupleN(args: Seq[String]): String = if (args.length == 1) s"Tuple1(${args.head})" else s"(${args.mkString(",")})"

  def createTupleNByDotI(to: Int, v: String = "self", from: Int = 1, step: Int = 1): String = createTupleN(dotISeq(to = to, v = v, from = from, step = step))

  def genericTupleOps(genUptoTupleN: Int = 12, nFuncsPlus2Colon3: Int = 8, margin: Int = 2, blankLine: Boolean = false): Seq[String] = {
    (1 to genUptoTupleN)
      .map { n =>
        def plus2Group: Seq[String] = {
          //    def ++[T3, T4](elems: (T3, T4)): (T1, T2, T3, T4) = (self._1, self._2, elems._1, elems._2)
          ((n + 1) to scala.math.min(nFuncsPlus2Colon3 + n, MaxBuiltInTuple))
            .map { j =>
              s"def ++[${typeIComma(from = n + 1, to = j)}](elems: ${tupleFromTo(from = n + 1, to = j)}): ${tupleFromTo(to = j)} = (${dotIComma(to = n)},${dotIComma(to = j - n, v = "elems")})"
            }
        }

        def colon3Group: Seq[String] = {
          //    def :::[B1, B2](elems: (B1, B2)): (B1, B2, T1, T2) = (elems._1, elems._2, self._1, self._2)
          (2 to scala.math.min(nFuncsPlus2Colon3, MaxBuiltInTuple - n))
            .map { j =>
              s"def :::[${typeIComma(to = j, prefix = "B")}](elems: ${tupleFromTo(to = j, prefix = "B")}): (${typeIComma(to = j, prefix = "B")},${typeIComma(to = n)}) = (${dotIComma(to = j, v = "elems")},${dotIComma(to = n)})"
            }
        }

        // no init/tail for Tuple1 cos no Tuple0
        val cDef =
          s"""implicit class Tuple${n}Ops[${typeIComma(n)}](private val self: ${tupleFromTo(n)}) extends AnyVal {
             |  def prepend[T](elem: T): (T, ${typeIComma(n)}) = (elem, ${dotIComma(n)})
             |  @inline def +:[T](elem: T): (T, ${typeIComma(n)}) = prepend(elem)
             |  def append[T](elem: T): (${typeIComma(n)}, T) = (${dotIComma(n)}, elem)
             |  @inline def :+[T](elem: T): (${typeIComma(n)}, T) = append(elem)
             |  @inline def ::[T](elem: T): (T, ${typeIComma(n)}) = prepend(elem)
             |  ${if (n > 1) s"def init: ${tupleFromTo(n - 1)} = ${createTupleN(dotISeq(n - 1))}" else ""}
             |  ${if (n > 1) s"def tail: ${tupleFromTo(from = 2, to = n)} = ${createTupleNByDotI(from = 2, to = n)}" else ""}
             |  def head: T1 = self._1
             |  def last: T$n = self._$n
             |  def reverse: ${tupleFromTo(from = n, to = 1, step = -1)} = ${createTupleNByDotI(from = n, to = 1, step = -1)}
             |  def size:Int = self.productArity
             |  def length:Int = self.productArity
             |${plus2Group.map("  " + _).mkString("\n")}
             |${colon3Group.map("  " + _).mkString("\n")}
             |}""".stripMargin.linesIterator.filterNot(_.forall(_.isWhitespace)).map(ln => List.fill(margin)(" ").mkString + ln).mkString("\n")

        if (blankLine) cDef + "\n"
        else cDef
      }
  }

  def tupleOfTupleOps(upToTupleN: Int = 8, fromTupleN: Int = 1, upToFlattenedN: Int = 16, maxSubTupleN: Int = 8, minSubTupleN: Int = 2, margin: Int = 2, blankLine: Boolean = false): Seq[String] = {
    require(fromTupleN <= upToTupleN)
    require(minSubTupleN <= maxSubTupleN)

    (fromTupleN to upToTupleN)
      .filter(n => n * minSubTupleN <= upToFlattenedN)
      .flatMap { n =>
        val psbSubNs = scala.collection.mutable.ListBuffer[Seq[Int]]()

        def max_ni(ni: Int, deteredSubNs: Seq[Int]) = { // ni: 1-based than 0-based
          assume(ni <= n && ni >= 1 && deteredSubNs.length == ni - 1 && deteredSubNs.forall(_ > 0))
          upToFlattenedN - deteredSubNs.sum - (n - ni)
        }

        def recvSel(ni: Int, partialDetered: Seq[Int]): Unit = {
          assert(partialDetered.length == ni - 1)
          val mi = max_ni(ni, partialDetered)
          (minSubTupleN to scala.math.min(mi, maxSubTupleN)).foreach { pi =>
            val npd = partialDetered :+ pi
            if (ni == n) psbSubNs += npd
            else recvSel(ni + 1, npd)
          }
        }

        recvSel(1, List.empty)

        assert(psbSubNs.nonEmpty && psbSubNs.forall(subns => subns.forall(_ > 0) && subns.sum <= upToFlattenedN) && psbSubNs.forall(_.length == n))
        assert(psbSubNs.toSet.toSeq.length == psbSubNs.length)

        psbSubNs.map { subTupleNs =>
          val fN = subTupleNs.sum // flattened tuple N
        val tRanges = subTupleNs.zipWithIndex.map(snI => tupleN(n = snI._1, from = subTupleNs.take(snI._2).sum + 1))
          val cDef =
            s"""implicit class Tuple${n}OfTuple${subTupleNs.mkString("N")}Ops[${typeIComma(fN)}](private val self: ${tupleNFromSeq(tRanges)}) extends AnyVal {
               |  def flatten: ${tupleFromTo(fN)} = ${createTupleN(subTupleNs.zipWithIndex.flatMap(snI => (1 to snI._1).map(sj => s"self._${snI._2 + 1}._${sj}")))}
               |}""".stripMargin.linesIterator.map(ln => List.fill(margin)(" ").mkString + ln).mkString("\n")

          if (blankLine) cDef + "\n"
          else cDef
        }
      }
  }

  def homogeneousTupleOps(toTupleN: Int = 16, fromTupleN: Int = 1, margin: Int = 2, blankLine: Boolean = false): Seq[String] = {
    (fromTupleN to toTupleN)
      .map { n =>
        val cDef =
          s"""implicit class HomogeneousTuple${n}Ops[T](private val self: ${homoTupleN(n)}) extends AnyVal {
             |  def map[B](f: T => B): ${homoTupleN(n, tp="B")} = ${createTupleN((1 to n).map(ni => s"f(self._${ni})"))}
             |  def foreach[U](f: T => U): Unit = toIterator.foreach(f)
             |  def forall(p: T => Boolean): Boolean = toIterator.forall(p)
             |  def exists(p: T => Boolean): Boolean = toIterator.exists(p)
             |  def find(p: T => Boolean): Option[T] = toIterator.find(p)
             |  def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
             |  def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
             |  def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
             |  def iterator: Iterator[T] = toIterator
             |  def toList:List[T] = toIterator.toList
             |  def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
             |  def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
             |  def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
             |  def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
             |  def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
             |  def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
             |  def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
             |  def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
             |}""".stripMargin.linesIterator.map(ln => List.fill(margin)(" ").mkString + ln).mkString("\n")

        if (blankLine) cDef + "\n"
        else cDef
      }
  }

}
