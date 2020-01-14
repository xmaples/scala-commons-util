package scalax

import scala.reflect.ClassTag

/**
  * Copyright xmaples
  * Licensed under Apache License 2.0
  * (http://www.apache.org/licenses/LICENSE-2.0).
  */
object TupleOps {
  /*==================== Generic Tuple Ops =================*/
  implicit class Tuple1Ops[T1](private val self: Tuple1[T1]) extends AnyVal {
    def prepend[T](elem: T): (T, T1) = (elem, self._1)
    @inline def +:[T](elem: T): (T, T1) = prepend(elem)
    def append[T](elem: T): (T1, T) = (self._1, elem)
    @inline def :+[T](elem: T): (T1, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1) = prepend(elem)
    def head: T1 = self._1
    def last: T1 = self._1
    def reverse: Tuple1[T1] = Tuple1(self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T2](elems: Tuple1[T2]): (T1,T2) = (self._1,elems._1)
    def ++[T2,T3](elems: (T2,T3)): (T1,T2,T3) = (self._1,elems._1,elems._2)
    def ++[T2,T3,T4](elems: (T2,T3,T4)): (T1,T2,T3,T4) = (self._1,elems._1,elems._2,elems._3)
    def ++[T2,T3,T4,T5](elems: (T2,T3,T4,T5)): (T1,T2,T3,T4,T5) = (self._1,elems._1,elems._2,elems._3,elems._4)
    def ++[T2,T3,T4,T5,T6](elems: (T2,T3,T4,T5,T6)): (T1,T2,T3,T4,T5,T6) = (self._1,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T2,T3,T4,T5,T6,T7](elems: (T2,T3,T4,T5,T6,T7)): (T1,T2,T3,T4,T5,T6,T7) = (self._1,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T2,T3,T4,T5,T6,T7,T8](elems: (T2,T3,T4,T5,T6,T7,T8)): (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T2,T3,T4,T5,T6,T7,T8,T9](elems: (T2,T3,T4,T5,T6,T7,T8,T9)): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1) = (elems._1,elems._2,self._1)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1) = (elems._1,elems._2,elems._3,self._1)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1) = (elems._1,elems._2,elems._3,elems._4,self._1)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1)
  }
  implicit class Tuple2Ops[T1,T2](private val self: (T1,T2)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2) = (elem, self._1,self._2)
    @inline def +:[T](elem: T): (T, T1,T2) = prepend(elem)
    def append[T](elem: T): (T1,T2, T) = (self._1,self._2, elem)
    @inline def :+[T](elem: T): (T1,T2, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2) = prepend(elem)
    def init: Tuple1[T1] = Tuple1(self._1)
    def tail: Tuple1[T2] = Tuple1(self._2)
    def head: T1 = self._1
    def last: T2 = self._2
    def reverse: (T2,T1) = (self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T3](elems: Tuple1[T3]): (T1,T2,T3) = (self._1,self._2,elems._1)
    def ++[T3,T4](elems: (T3,T4)): (T1,T2,T3,T4) = (self._1,self._2,elems._1,elems._2)
    def ++[T3,T4,T5](elems: (T3,T4,T5)): (T1,T2,T3,T4,T5) = (self._1,self._2,elems._1,elems._2,elems._3)
    def ++[T3,T4,T5,T6](elems: (T3,T4,T5,T6)): (T1,T2,T3,T4,T5,T6) = (self._1,self._2,elems._1,elems._2,elems._3,elems._4)
    def ++[T3,T4,T5,T6,T7](elems: (T3,T4,T5,T6,T7)): (T1,T2,T3,T4,T5,T6,T7) = (self._1,self._2,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T3,T4,T5,T6,T7,T8](elems: (T3,T4,T5,T6,T7,T8)): (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,self._2,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T3,T4,T5,T6,T7,T8,T9](elems: (T3,T4,T5,T6,T7,T8,T9)): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T3,T4,T5,T6,T7,T8,T9,T10](elems: (T3,T4,T5,T6,T7,T8,T9,T10)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2) = (elems._1,elems._2,self._1,self._2)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2) = (elems._1,elems._2,elems._3,self._1,self._2)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2)
  }
  implicit class Tuple3Ops[T1,T2,T3](private val self: (T1,T2,T3)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3) = (elem, self._1,self._2,self._3)
    @inline def +:[T](elem: T): (T, T1,T2,T3) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3, T) = (self._1,self._2,self._3, elem)
    @inline def :+[T](elem: T): (T1,T2,T3, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3) = prepend(elem)
    def init: (T1,T2) = (self._1,self._2)
    def tail: (T2,T3) = (self._2,self._3)
    def head: T1 = self._1
    def last: T3 = self._3
    def reverse: (T3,T2,T1) = (self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T4](elems: Tuple1[T4]): (T1,T2,T3,T4) = (self._1,self._2,self._3,elems._1)
    def ++[T4,T5](elems: (T4,T5)): (T1,T2,T3,T4,T5) = (self._1,self._2,self._3,elems._1,elems._2)
    def ++[T4,T5,T6](elems: (T4,T5,T6)): (T1,T2,T3,T4,T5,T6) = (self._1,self._2,self._3,elems._1,elems._2,elems._3)
    def ++[T4,T5,T6,T7](elems: (T4,T5,T6,T7)): (T1,T2,T3,T4,T5,T6,T7) = (self._1,self._2,self._3,elems._1,elems._2,elems._3,elems._4)
    def ++[T4,T5,T6,T7,T8](elems: (T4,T5,T6,T7,T8)): (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,self._2,self._3,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T4,T5,T6,T7,T8,T9](elems: (T4,T5,T6,T7,T8,T9)): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,self._3,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T4,T5,T6,T7,T8,T9,T10](elems: (T4,T5,T6,T7,T8,T9,T10)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T4,T5,T6,T7,T8,T9,T10,T11](elems: (T4,T5,T6,T7,T8,T9,T10,T11)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3) = (elems._1,elems._2,self._1,self._2,self._3)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3) = (elems._1,elems._2,elems._3,self._1,self._2,self._3)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3)
  }
  implicit class Tuple4Ops[T1,T2,T3,T4](private val self: (T1,T2,T3,T4)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4) = (elem, self._1,self._2,self._3,self._4)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4, T) = (self._1,self._2,self._3,self._4, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4) = prepend(elem)
    def init: (T1,T2,T3) = (self._1,self._2,self._3)
    def tail: (T2,T3,T4) = (self._2,self._3,self._4)
    def head: T1 = self._1
    def last: T4 = self._4
    def reverse: (T4,T3,T2,T1) = (self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T5](elems: Tuple1[T5]): (T1,T2,T3,T4,T5) = (self._1,self._2,self._3,self._4,elems._1)
    def ++[T5,T6](elems: (T5,T6)): (T1,T2,T3,T4,T5,T6) = (self._1,self._2,self._3,self._4,elems._1,elems._2)
    def ++[T5,T6,T7](elems: (T5,T6,T7)): (T1,T2,T3,T4,T5,T6,T7) = (self._1,self._2,self._3,self._4,elems._1,elems._2,elems._3)
    def ++[T5,T6,T7,T8](elems: (T5,T6,T7,T8)): (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,self._2,self._3,self._4,elems._1,elems._2,elems._3,elems._4)
    def ++[T5,T6,T7,T8,T9](elems: (T5,T6,T7,T8,T9)): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,self._3,self._4,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T5,T6,T7,T8,T9,T10](elems: (T5,T6,T7,T8,T9,T10)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,self._4,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T5,T6,T7,T8,T9,T10,T11](elems: (T5,T6,T7,T8,T9,T10,T11)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T5,T6,T7,T8,T9,T10,T11,T12](elems: (T5,T6,T7,T8,T9,T10,T11,T12)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4) = (elems._1,elems._2,self._1,self._2,self._3,self._4)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4)
  }
  implicit class Tuple5Ops[T1,T2,T3,T4,T5](private val self: (T1,T2,T3,T4,T5)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5) = (elem, self._1,self._2,self._3,self._4,self._5)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5, T) = (self._1,self._2,self._3,self._4,self._5, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5) = prepend(elem)
    def init: (T1,T2,T3,T4) = (self._1,self._2,self._3,self._4)
    def tail: (T2,T3,T4,T5) = (self._2,self._3,self._4,self._5)
    def head: T1 = self._1
    def last: T5 = self._5
    def reverse: (T5,T4,T3,T2,T1) = (self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T6](elems: Tuple1[T6]): (T1,T2,T3,T4,T5,T6) = (self._1,self._2,self._3,self._4,self._5,elems._1)
    def ++[T6,T7](elems: (T6,T7)): (T1,T2,T3,T4,T5,T6,T7) = (self._1,self._2,self._3,self._4,self._5,elems._1,elems._2)
    def ++[T6,T7,T8](elems: (T6,T7,T8)): (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,self._2,self._3,self._4,self._5,elems._1,elems._2,elems._3)
    def ++[T6,T7,T8,T9](elems: (T6,T7,T8,T9)): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,self._3,self._4,self._5,elems._1,elems._2,elems._3,elems._4)
    def ++[T6,T7,T8,T9,T10](elems: (T6,T7,T8,T9,T10)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,self._4,self._5,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T6,T7,T8,T9,T10,T11](elems: (T6,T7,T8,T9,T10,T11)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,self._5,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T6,T7,T8,T9,T10,T11,T12](elems: (T6,T7,T8,T9,T10,T11,T12)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,self._5,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T6,T7,T8,T9,T10,T11,T12,T13](elems: (T6,T7,T8,T9,T10,T11,T12,T13)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5)
  }
  implicit class Tuple6Ops[T1,T2,T3,T4,T5,T6](private val self: (T1,T2,T3,T4,T5,T6)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5,T6) = (elem, self._1,self._2,self._3,self._4,self._5,self._6)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5,T6) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5,T6, T) = (self._1,self._2,self._3,self._4,self._5,self._6, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5,T6, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5,T6) = prepend(elem)
    def init: (T1,T2,T3,T4,T5) = (self._1,self._2,self._3,self._4,self._5)
    def tail: (T2,T3,T4,T5,T6) = (self._2,self._3,self._4,self._5,self._6)
    def head: T1 = self._1
    def last: T6 = self._6
    def reverse: (T6,T5,T4,T3,T2,T1) = (self._6,self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T7](elems: Tuple1[T7]): (T1,T2,T3,T4,T5,T6,T7) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1)
    def ++[T7,T8](elems: (T7,T8)): (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1,elems._2)
    def ++[T7,T8,T9](elems: (T7,T8,T9)): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1,elems._2,elems._3)
    def ++[T7,T8,T9,T10](elems: (T7,T8,T9,T10)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1,elems._2,elems._3,elems._4)
    def ++[T7,T8,T9,T10,T11](elems: (T7,T8,T9,T10,T11)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T7,T8,T9,T10,T11,T12](elems: (T7,T8,T9,T10,T11,T12)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T7,T8,T9,T10,T11,T12,T13](elems: (T7,T8,T9,T10,T11,T12,T13)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T7,T8,T9,T10,T11,T12,T13,T14](elems: (T7,T8,T9,T10,T11,T12,T13,T14)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1,self._2,self._3,self._4,self._5,self._6,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5,T6) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5,self._6)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5,T6) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5,self._6)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5,T6) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5,self._6)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5,T6) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5,self._6)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5,T6) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5,self._6)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5,T6) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5,self._6)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5,T6) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5,self._6)
  }
  implicit class Tuple7Ops[T1,T2,T3,T4,T5,T6,T7](private val self: (T1,T2,T3,T4,T5,T6,T7)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7) = (elem, self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5,T6,T7, T) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5,T6,T7, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7) = prepend(elem)
    def init: (T1,T2,T3,T4,T5,T6) = (self._1,self._2,self._3,self._4,self._5,self._6)
    def tail: (T2,T3,T4,T5,T6,T7) = (self._2,self._3,self._4,self._5,self._6,self._7)
    def head: T1 = self._1
    def last: T7 = self._7
    def reverse: (T7,T6,T5,T4,T3,T2,T1) = (self._7,self._6,self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T8](elems: Tuple1[T8]): (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1)
    def ++[T8,T9](elems: (T8,T9)): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1,elems._2)
    def ++[T8,T9,T10](elems: (T8,T9,T10)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1,elems._2,elems._3)
    def ++[T8,T9,T10,T11](elems: (T8,T9,T10,T11)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1,elems._2,elems._3,elems._4)
    def ++[T8,T9,T10,T11,T12](elems: (T8,T9,T10,T11,T12)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T8,T9,T10,T11,T12,T13](elems: (T8,T9,T10,T11,T12,T13)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T8,T9,T10,T11,T12,T13,T14](elems: (T8,T9,T10,T11,T12,T13,T14)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T8,T9,T10,T11,T12,T13,T14,T15](elems: (T8,T9,T10,T11,T12,T13,T14,T15)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5,T6,T7) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5,T6,T7) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5,T6,T7) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5,T6,T7) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5,T6,T7) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5,T6,T7) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5,T6,T7) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5,self._6,self._7)
  }
  implicit class Tuple8Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: (T1,T2,T3,T4,T5,T6,T7,T8)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8) = (elem, self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8, T) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8) = prepend(elem)
    def init: (T1,T2,T3,T4,T5,T6,T7) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7)
    def tail: (T2,T3,T4,T5,T6,T7,T8) = (self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def head: T1 = self._1
    def last: T8 = self._8
    def reverse: (T8,T7,T6,T5,T4,T3,T2,T1) = (self._8,self._7,self._6,self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T9](elems: Tuple1[T9]): (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1)
    def ++[T9,T10](elems: (T9,T10)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1,elems._2)
    def ++[T9,T10,T11](elems: (T9,T10,T11)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1,elems._2,elems._3)
    def ++[T9,T10,T11,T12](elems: (T9,T10,T11,T12)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1,elems._2,elems._3,elems._4)
    def ++[T9,T10,T11,T12,T13](elems: (T9,T10,T11,T12,T13)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T9,T10,T11,T12,T13,T14](elems: (T9,T10,T11,T12,T13,T14)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T9,T10,T11,T12,T13,T14,T15](elems: (T9,T10,T11,T12,T13,T14,T15)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T9,T10,T11,T12,T13,T14,T15,T16](elems: (T9,T10,T11,T12,T13,T14,T15,T16)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5,T6,T7,T8) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5,T6,T7,T8) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5,T6,T7,T8) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5,T6,T7,T8) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5,T6,T7,T8) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5,T6,T7,T8) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5,T6,T7,T8) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
  }
  implicit class Tuple9Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: (T1,T2,T3,T4,T5,T6,T7,T8,T9)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elem, self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9, T) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9) = prepend(elem)
    def init: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8)
    def tail: (T2,T3,T4,T5,T6,T7,T8,T9) = (self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def head: T1 = self._1
    def last: T9 = self._9
    def reverse: (T9,T8,T7,T6,T5,T4,T3,T2,T1) = (self._9,self._8,self._7,self._6,self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T10](elems: Tuple1[T10]): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1)
    def ++[T10,T11](elems: (T10,T11)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1,elems._2)
    def ++[T10,T11,T12](elems: (T10,T11,T12)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1,elems._2,elems._3)
    def ++[T10,T11,T12,T13](elems: (T10,T11,T12,T13)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1,elems._2,elems._3,elems._4)
    def ++[T10,T11,T12,T13,T14](elems: (T10,T11,T12,T13,T14)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T10,T11,T12,T13,T14,T15](elems: (T10,T11,T12,T13,T14,T15)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T10,T11,T12,T13,T14,T15,T16](elems: (T10,T11,T12,T13,T14,T15,T16)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T10,T11,T12,T13,T14,T15,T16,T17](elems: (T10,T11,T12,T13,T14,T15,T16,T17)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5,T6,T7,T8,T9) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
  }
  implicit class Tuple10Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elem, self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, T) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = prepend(elem)
    def init: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9)
    def tail: (T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def head: T1 = self._1
    def last: T10 = self._10
    def reverse: (T10,T9,T8,T7,T6,T5,T4,T3,T2,T1) = (self._10,self._9,self._8,self._7,self._6,self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T11](elems: Tuple1[T11]): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1)
    def ++[T11,T12](elems: (T11,T12)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1,elems._2)
    def ++[T11,T12,T13](elems: (T11,T12,T13)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1,elems._2,elems._3)
    def ++[T11,T12,T13,T14](elems: (T11,T12,T13,T14)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1,elems._2,elems._3,elems._4)
    def ++[T11,T12,T13,T14,T15](elems: (T11,T12,T13,T14,T15)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T11,T12,T13,T14,T15,T16](elems: (T11,T12,T13,T14,T15,T16)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T11,T12,T13,T14,T15,T16,T17](elems: (T11,T12,T13,T14,T15,T16,T17)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T11,T12,T13,T14,T15,T16,T17,T18](elems: (T11,T12,T13,T14,T15,T16,T17,T18)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
  }
  implicit class Tuple11Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elem, self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, T) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = prepend(elem)
    def init: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10)
    def tail: (T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def head: T1 = self._1
    def last: T11 = self._11
    def reverse: (T11,T10,T9,T8,T7,T6,T5,T4,T3,T2,T1) = (self._11,self._10,self._9,self._8,self._7,self._6,self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T12](elems: Tuple1[T12]): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1)
    def ++[T12,T13](elems: (T12,T13)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1,elems._2)
    def ++[T12,T13,T14](elems: (T12,T13,T14)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1,elems._2,elems._3)
    def ++[T12,T13,T14,T15](elems: (T12,T13,T14,T15)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1,elems._2,elems._3,elems._4)
    def ++[T12,T13,T14,T15,T16](elems: (T12,T13,T14,T15,T16)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T12,T13,T14,T15,T16,T17](elems: (T12,T13,T14,T15,T16,T17)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T12,T13,T14,T15,T16,T17,T18](elems: (T12,T13,T14,T15,T16,T17,T18)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T12,T13,T14,T15,T16,T17,T18,T19](elems: (T12,T13,T14,T15,T16,T17,T18,T19)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
  }
  implicit class Tuple12Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12)) extends AnyVal {
    def prepend[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elem, self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    @inline def +:[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = prepend(elem)
    def append[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, T) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12, elem)
    @inline def :+[T](elem: T): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12, T) = append(elem)
    @inline def ::[T](elem: T): (T, T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = prepend(elem)
    def init: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11)
    def tail: (T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    def head: T1 = self._1
    def last: T12 = self._12
    def reverse: (T12,T11,T10,T9,T8,T7,T6,T5,T4,T3,T2,T1) = (self._12,self._11,self._10,self._9,self._8,self._7,self._6,self._5,self._4,self._3,self._2,self._1)
    def size:Int = self.productArity
    def length:Int = self.productArity
    def ++[T13](elems: Tuple1[T13]): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1)
    def ++[T13,T14](elems: (T13,T14)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1,elems._2)
    def ++[T13,T14,T15](elems: (T13,T14,T15)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1,elems._2,elems._3)
    def ++[T13,T14,T15,T16](elems: (T13,T14,T15,T16)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1,elems._2,elems._3,elems._4)
    def ++[T13,T14,T15,T16,T17](elems: (T13,T14,T15,T16,T17)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1,elems._2,elems._3,elems._4,elems._5)
    def ++[T13,T14,T15,T16,T17,T18](elems: (T13,T14,T15,T16,T17,T18)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6)
    def ++[T13,T14,T15,T16,T17,T18,T19](elems: (T13,T14,T15,T16,T17,T18,T19)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7)
    def ++[T13,T14,T15,T16,T17,T18,T19,T20](elems: (T13,T14,T15,T16,T17,T18,T19,T20)): (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) = (self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12,elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8)
    def :::[B1,B2](elems: (B1,B2)): (B1,B2,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elems._1,elems._2,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    def :::[B1,B2,B3](elems: (B1,B2,B3)): (B1,B2,B3,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elems._1,elems._2,elems._3,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    def :::[B1,B2,B3,B4](elems: (B1,B2,B3,B4)): (B1,B2,B3,B4,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elems._1,elems._2,elems._3,elems._4,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    def :::[B1,B2,B3,B4,B5](elems: (B1,B2,B3,B4,B5)): (B1,B2,B3,B4,B5,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elems._1,elems._2,elems._3,elems._4,elems._5,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    def :::[B1,B2,B3,B4,B5,B6](elems: (B1,B2,B3,B4,B5,B6)): (B1,B2,B3,B4,B5,B6,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    def :::[B1,B2,B3,B4,B5,B6,B7](elems: (B1,B2,B3,B4,B5,B6,B7)): (B1,B2,B3,B4,B5,B6,B7,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
    def :::[B1,B2,B3,B4,B5,B6,B7,B8](elems: (B1,B2,B3,B4,B5,B6,B7,B8)): (B1,B2,B3,B4,B5,B6,B7,B8,T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (elems._1,elems._2,elems._3,elems._4,elems._5,elems._6,elems._7,elems._8,self._1,self._2,self._3,self._4,self._5,self._6,self._7,self._8,self._9,self._10,self._11,self._12)
  }

  /*==================== Homogeneous Tuple Ops =================*/
  implicit class HomogeneousTuple1Ops[T](private val self: Tuple1[T]) extends AnyVal {
    def map[B](f: T => B): Tuple1[B] = Tuple1(f(self._1))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple2Ops[T](private val self: (T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B) = (f(self._1),f(self._2))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple3Ops[T](private val self: (T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B) = (f(self._1),f(self._2),f(self._3))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple4Ops[T](private val self: (T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple5Ops[T](private val self: (T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple6Ops[T](private val self: (T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple7Ops[T](private val self: (T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple8Ops[T](private val self: (T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple9Ops[T](private val self: (T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple10Ops[T](private val self: (T,T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9),f(self._10))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple11Ops[T](private val self: (T,T,T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9),f(self._10),f(self._11))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple12Ops[T](private val self: (T,T,T,T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9),f(self._10),f(self._11),f(self._12))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple13Ops[T](private val self: (T,T,T,T,T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9),f(self._10),f(self._11),f(self._12),f(self._13))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple14Ops[T](private val self: (T,T,T,T,T,T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9),f(self._10),f(self._11),f(self._12),f(self._13),f(self._14))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple15Ops[T](private val self: (T,T,T,T,T,T,T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9),f(self._10),f(self._11),f(self._12),f(self._13),f(self._14),f(self._15))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }
  implicit class HomogeneousTuple16Ops[T](private val self: (T,T,T,T,T,T,T,T,T,T,T,T,T,T,T,T)) extends AnyVal {
    def map[B](f: T => B): (B,B,B,B,B,B,B,B,B,B,B,B,B,B,B,B) = (f(self._1),f(self._2),f(self._3),f(self._4),f(self._5),f(self._6),f(self._7),f(self._8),f(self._9),f(self._10),f(self._11),f(self._12),f(self._13),f(self._14),f(self._15),f(self._16))
    def foreach[U](f: T => U): Unit = toIterator.foreach(f)
    def forall(p: T => Boolean): Boolean = toIterator.forall(p)
    def exists(p: T => Boolean): Boolean = toIterator.exists(p)
    def find(p: T => Boolean): Option[T] = toIterator.find(p)
    def copyToArray[B >: T](xs: Array[B], start: Int, len: Int): Unit = toIterator.copyToArray(xs, start, len)
    def toArray[B >: T : ClassTag]: Array[B] = toIterator.toArray
    def toIterator: Iterator[T] = self.productIterator.asInstanceOf[Iterator[T]]
    def iterator: Iterator[T] = toIterator
    def toList:List[T] = toIterator.toList
    def sum[B >: T](implicit num: Numeric[B]): B = foldLeft(num.zero)(num.plus)
    def apply(idx:Int):T = self.productElement(idx).asInstanceOf[T]
    def fold[B](z:B)(op:(B,T)=>B):B = foldLeft(z)(op)
    def foldLeft[B](z:B)(op:(B,T)=>B):B = toIterator.foldLeft(z)(op)
    def foldRight[B](z:B)(op:(T,B)=>B):B = toIterator.foldRight(z)(op)
    def reduce[B>:T](op:(B,B)=>B):B = reduceLeft(op)
    def reduceLeft[B>:T](op:(B,B)=>B):B = toIterator.reduceLeft(op)
    def reduceRight[B>:T](op:(B,B)=>B):B = toIterator.reduceRight(op)
  }

  /*==================== Tuple of Tuple Ops =================*/
  implicit class Tuple1OfTuple2Ops[T1,T2](private val self: Tuple1[(T1,T2)]) extends AnyVal {
    def flatten: (T1,T2) = (self._1._1,self._1._2)
  }
  implicit class Tuple1OfTuple3Ops[T1,T2,T3](private val self: Tuple1[(T1,T2,T3)]) extends AnyVal {
    def flatten: (T1,T2,T3) = (self._1._1,self._1._2,self._1._3)
  }
  implicit class Tuple1OfTuple4Ops[T1,T2,T3,T4](private val self: Tuple1[(T1,T2,T3,T4)]) extends AnyVal {
    def flatten: (T1,T2,T3,T4) = (self._1._1,self._1._2,self._1._3,self._1._4)
  }
  implicit class Tuple1OfTuple5Ops[T1,T2,T3,T4,T5](private val self: Tuple1[(T1,T2,T3,T4,T5)]) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5)
  }
  implicit class Tuple1OfTuple6Ops[T1,T2,T3,T4,T5,T6](private val self: Tuple1[(T1,T2,T3,T4,T5,T6)]) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6)
  }
  implicit class Tuple1OfTuple7Ops[T1,T2,T3,T4,T5,T6,T7](private val self: Tuple1[(T1,T2,T3,T4,T5,T6,T7)]) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7)
  }
  implicit class Tuple1OfTuple8Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: Tuple1[(T1,T2,T3,T4,T5,T6,T7,T8)]) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8)
  }
  implicit class Tuple2OfTuple2N2Ops[T1,T2,T3,T4](private val self: ((T1,T2),(T3,T4))) extends AnyVal {
    def flatten: (T1,T2,T3,T4) = (self._1._1,self._1._2,self._2._1,self._2._2)
  }
  implicit class Tuple2OfTuple2N3Ops[T1,T2,T3,T4,T5](private val self: ((T1,T2),(T3,T4,T5))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3)
  }
  implicit class Tuple2OfTuple2N4Ops[T1,T2,T3,T4,T5,T6](private val self: ((T1,T2),(T3,T4,T5,T6))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4)
  }
  implicit class Tuple2OfTuple2N5Ops[T1,T2,T3,T4,T5,T6,T7](private val self: ((T1,T2),(T3,T4,T5,T6,T7))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5)
  }
  implicit class Tuple2OfTuple2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6)
  }
  implicit class Tuple2OfTuple2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7)
  }
  implicit class Tuple2OfTuple2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8)
  }
  implicit class Tuple2OfTuple3N2Ops[T1,T2,T3,T4,T5](private val self: ((T1,T2,T3),(T4,T5))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2)
  }
  implicit class Tuple2OfTuple3N3Ops[T1,T2,T3,T4,T5,T6](private val self: ((T1,T2,T3),(T4,T5,T6))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3)
  }
  implicit class Tuple2OfTuple3N4Ops[T1,T2,T3,T4,T5,T6,T7](private val self: ((T1,T2,T3),(T4,T5,T6,T7))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4)
  }
  implicit class Tuple2OfTuple3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5)
  }
  implicit class Tuple2OfTuple3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6)
  }
  implicit class Tuple2OfTuple3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7)
  }
  implicit class Tuple2OfTuple3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8)
  }
  implicit class Tuple2OfTuple4N2Ops[T1,T2,T3,T4,T5,T6](private val self: ((T1,T2,T3,T4),(T5,T6))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2)
  }
  implicit class Tuple2OfTuple4N3Ops[T1,T2,T3,T4,T5,T6,T7](private val self: ((T1,T2,T3,T4),(T5,T6,T7))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3)
  }
  implicit class Tuple2OfTuple4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4)
  }
  implicit class Tuple2OfTuple4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5)
  }
  implicit class Tuple2OfTuple4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6)
  }
  implicit class Tuple2OfTuple4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7)
  }
  implicit class Tuple2OfTuple4N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8)
  }
  implicit class Tuple2OfTuple5N2Ops[T1,T2,T3,T4,T5,T6,T7](private val self: ((T1,T2,T3,T4,T5),(T6,T7))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2)
  }
  implicit class Tuple2OfTuple5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3)
  }
  implicit class Tuple2OfTuple5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4)
  }
  implicit class Tuple2OfTuple5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5)
  }
  implicit class Tuple2OfTuple5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6)
  }
  implicit class Tuple2OfTuple5N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7)
  }
  implicit class Tuple2OfTuple5N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8)
  }
  implicit class Tuple2OfTuple6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2)
  }
  implicit class Tuple2OfTuple6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3)
  }
  implicit class Tuple2OfTuple6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4)
  }
  implicit class Tuple2OfTuple6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5)
  }
  implicit class Tuple2OfTuple6N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6)
  }
  implicit class Tuple2OfTuple6N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7)
  }
  implicit class Tuple2OfTuple6N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8)
  }
  implicit class Tuple2OfTuple7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2)
  }
  implicit class Tuple2OfTuple7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3)
  }
  implicit class Tuple2OfTuple7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4)
  }
  implicit class Tuple2OfTuple7N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5)
  }
  implicit class Tuple2OfTuple7N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6)
  }
  implicit class Tuple2OfTuple7N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7)
  }
  implicit class Tuple2OfTuple7N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8)
  }
  implicit class Tuple2OfTuple8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2)
  }
  implicit class Tuple2OfTuple8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3)
  }
  implicit class Tuple2OfTuple8N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4)
  }
  implicit class Tuple2OfTuple8N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5)
  }
  implicit class Tuple2OfTuple8N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6)
  }
  implicit class Tuple2OfTuple8N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7)
  }
  implicit class Tuple2OfTuple8N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8)
  }
  implicit class Tuple3OfTuple2N2N2Ops[T1,T2,T3,T4,T5,T6](private val self: ((T1,T2),(T3,T4),(T5,T6))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple2N2N3Ops[T1,T2,T3,T4,T5,T6,T7](private val self: ((T1,T2),(T3,T4),(T5,T6,T7))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple2N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple2N3N2Ops[T1,T2,T3,T4,T5,T6,T7](private val self: ((T1,T2),(T3,T4,T5),(T6,T7))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple2N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple2N3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple2N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple2N4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple2N4N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple2N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple2N5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple2N5N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple2N5N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple2N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple2N6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple2N6N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple2N6N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple2N6N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple2N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple2N7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple2N7N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple2N7N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple2N7N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple2N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple2N8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple2N8N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple2N8N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple2N8N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple3N2N2Ops[T1,T2,T3,T4,T5,T6,T7](private val self: ((T1,T2,T3),(T4,T5),(T6,T7))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple3N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple3N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple3N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple3N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple3N3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple3N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple3N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple3N4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple3N4N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple3N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple3N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple3N5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple3N5N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple3N5N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple3N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple3N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple3N6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple3N6N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple3N6N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple3N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple3N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple3N7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple3N7N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple3N7N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple3N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple3N8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple3N8N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple3N8N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple4N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple4N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple4N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple4N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple4N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple4N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple4N3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple4N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple4N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple4N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple4N4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple4N4N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple4N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple4N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple4N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple4N5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple4N5N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple4N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple4N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple4N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple4N6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple4N6N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple4N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple4N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple4N7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple4N7N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple4N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple4N8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple4N8N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple5N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple5N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple5N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple5N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple5N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple5N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple5N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple5N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple5N3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple5N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple5N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple5N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple5N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple5N4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple5N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple5N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple5N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple5N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple5N5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple5N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple5N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple5N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple5N6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple5N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple5N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple5N7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple5N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple5N8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple6N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple6N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple6N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple6N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple6N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8)
  }
  implicit class Tuple3OfTuple6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple6N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple6N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple6N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple6N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple6N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple6N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple6N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple6N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple6N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple6N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple6N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple6N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple6N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple6N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple6N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple6N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple6N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple6N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple6N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple6N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple7N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple7N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple7N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple7N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple7N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7)
  }
  implicit class Tuple3OfTuple7N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple7N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple7N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple7N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple7N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple7N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple7N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple7N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple7N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple7N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple7N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple7N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple7N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple7N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple7N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple8N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple8N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple8N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple8N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple8N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6)
  }
  implicit class Tuple3OfTuple8N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple8N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple8N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple8N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5)
  }
  implicit class Tuple3OfTuple8N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple8N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple8N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4)
  }
  implicit class Tuple3OfTuple8N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2)
  }
  implicit class Tuple3OfTuple8N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3)
  }
  implicit class Tuple3OfTuple8N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2)
  }
  implicit class Tuple4OfTuple2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N2N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N2N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N2N3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N2N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N2N4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N2N4N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N2N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N2N5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N2N5N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N2N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N2N6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N2N6N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N2N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N2N7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N2N7N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N2N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N2N8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N2N8N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N3N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N3N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N3N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N3N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N3N3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N3N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N3N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N3N4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N3N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N3N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N3N5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N3N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N3N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N3N6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N3N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N3N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N3N7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N3N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N3N8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N4N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N4N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N4N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N4N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N4N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N4N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N4N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N4N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N4N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N4N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N4N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N4N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N4N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N4N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N4N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N4N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N4N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N4N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N5N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N5N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N5N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple2N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N5N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N5N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N5N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N5N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N5N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N5N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N5N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N5N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N5N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N5N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N5N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N5N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N6N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N6N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N6N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple2N6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N6N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N6N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N6N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N6N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N6N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N6N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N6N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N6N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N6N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N7N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N7N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N7N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple2N7N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N7N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N7N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N7N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N7N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N7N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N8N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N8N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N8N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple2N8N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple2N8N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple2N8N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple3N2N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N2N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple3N2N3N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N2N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N2N4N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple3N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N2N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N2N5N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N2N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N2N6N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N2N7N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N2N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N2N8N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N3N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple3N3N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N3N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N3N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple3N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N3N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N3N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N3N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N3N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N3N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N3N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N3N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N3N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N3N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N4N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N4N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple3N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N4N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N4N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N4N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N4N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N4N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N4N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N4N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N4N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N4N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N5N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N5N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple3N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N5N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N5N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N5N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N5N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N5N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N5N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N5N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N6N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N6N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple3N6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N6N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N6N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N6N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N6N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N6N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N7N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N7N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple3N7N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N7N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N7N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N8N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple3N8N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple3N8N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple4N2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple4N2N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8)
  }
  implicit class Tuple4OfTuple4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple4N2N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple4N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N2N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple4N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N2N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N2N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N2N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N2N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple4N3N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple4N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N3N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple4N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N3N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N3N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N3N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N3N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N4N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple4N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N4N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N4N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N4N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N4N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N5N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple4N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N5N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N5N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N5N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N6N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple4N6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N6N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N6N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N7N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple4N7N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple4N8N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple5N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple5N2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7)
  }
  implicit class Tuple4OfTuple5N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple5N2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple5N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple5N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple5N3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple5N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple5N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple5N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple5N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple5N6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple5N7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple6N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple6N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6)
  }
  implicit class Tuple4OfTuple6N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple6N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple6N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple6N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple6N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple6N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple6N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple6N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple6N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple6N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple7N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple7N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5)
  }
  implicit class Tuple4OfTuple7N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple7N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple7N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple7N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple7N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple7N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple7N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple7N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple7N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple8N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple8N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple8N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4)
  }
  implicit class Tuple4OfTuple8N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple8N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple8N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple8N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple8N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3)
  }
  implicit class Tuple4OfTuple8N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2)
  }
  implicit class Tuple4OfTuple8N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2)
  }
  implicit class Tuple5OfTuple2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N2N2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6,self._5._7)
  }
  implicit class Tuple5OfTuple2N2N2N2N8Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6,self._5._7,self._5._8)
  }
  implicit class Tuple5OfTuple2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N2N2N3N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6,self._5._7)
  }
  implicit class Tuple5OfTuple2N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N2N4N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N2N5N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N2N6N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N2N7N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N2N8N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._4._8,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N2N3N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6,self._5._7)
  }
  implicit class Tuple5OfTuple2N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N3N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N3N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N3N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N3N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N3N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N4N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N4N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N4N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N4N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N4N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N5N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N2N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N5N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N5N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N5N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N6N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N2N6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N6N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N6N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N7N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N2N7N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N2N8N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._3._8,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N3N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N3N2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6,self._5._7)
  }
  implicit class Tuple5OfTuple2N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N3N2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N3N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N3N3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N3N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N3N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N3N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N3N6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N3N7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N4N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N4N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple2N4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N4N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N4N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N4N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N4N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N4N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N4N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N4N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N4N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N4N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N5N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N5N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple2N5N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N5N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N5N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N5N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N5N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N5N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N5N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N5N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N5N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N6N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N6N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N6N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple2N6N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N6N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N6N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N6N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N6N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N6N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N6N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N7N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N7N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple2N7N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N7N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple2N8N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._2._8,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N2N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple3N2N2N2N7Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6,self._5._7)
  }
  implicit class Tuple5OfTuple3N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N2N2N3N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple3N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N2N4N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N2N5N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N2N6N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N2N7N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._4._7,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N2N3N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple3N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N3N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N3N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N3N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N3N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N4N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N4N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N4N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N4N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N5N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N2N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N5N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N5N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N6N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N2N6N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N2N7N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._3._7,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N3N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N3N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple3N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N3N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N3N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N3N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N3N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N3N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N3N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N3N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N4N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N4N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple3N4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N4N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N4N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N4N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N4N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N4N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N4N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N4N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N4N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N5N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N5N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple3N5N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N5N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N5N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N5N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N5N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N5N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N5N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N6N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N6N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple3N6N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N6N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple3N7N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._2._7,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple4N2N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6)
  }
  implicit class Tuple5OfTuple4N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N2N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple4N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N2N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple4N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N2N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N2N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N3N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple4N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N3N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N3N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N3N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N3N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N3N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N3N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N4N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple4N4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N4N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N4N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N4N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N4N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N4N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N5N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple4N5N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N5N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple4N6N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple5N2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5)
  }
  implicit class Tuple5OfTuple5N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple5N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple5N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple5N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple5N4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple5N5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple6N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4)
  }
  implicit class Tuple5OfTuple6N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple6N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple6N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple6N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple6N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple7N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple7N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3)
  }
  implicit class Tuple5OfTuple7N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple7N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple7N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple5OfTuple8N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._1._7,self._1._8,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2)
  }
  implicit class Tuple6OfTuple2N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4,self._6._5)
  }
  implicit class Tuple6OfTuple2N2N2N2N2N6Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4,self._6._5,self._6._6)
  }
  implicit class Tuple6OfTuple2N2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N2N2N3N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3,self._6._4,self._6._5)
  }
  implicit class Tuple6OfTuple2N2N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N2N4N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N2N5N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N2N6N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._5._6,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N2N3N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4,self._6._5)
  }
  implicit class Tuple6OfTuple2N2N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N3N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N3N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N3N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N4N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N4N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N4N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N5N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N2N5N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N2N6N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._4._6,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N3N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4,self._6._5)
  }
  implicit class Tuple6OfTuple2N2N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N3N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N3N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N3N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N3N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N3N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N3N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N4N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N2N4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N4N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N4N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N4N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N4N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N4N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N5N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N2N5N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N5N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N2N6N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._3._6,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N3N2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4,self._6._5)
  }
  implicit class Tuple6OfTuple2N3N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N3N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N3N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N3N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N3N4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N3N5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N4N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple2N4N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N4N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N4N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N4N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N4N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N5N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N5N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple2N5N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N5N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N5N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple2N6N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._2._6,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple3N2N2N2N2N5Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4,self._6._5)
  }
  implicit class Tuple6OfTuple3N2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N2N2N3N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple3N2N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N2N4N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N2N2N5N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._5._5,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N2N3N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple3N2N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N3N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N2N3N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N4N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N2N4N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N2N5N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._4._5,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N3N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple3N2N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N3N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N3N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N3N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N3N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N3N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N4N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N2N4N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N4N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N2N5N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._3._5,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N3N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple3N3N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N3N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N3N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N3N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N3N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N4N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N4N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple3N4N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N4N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N4N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple3N5N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._2._4,self._2._5,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple4N2N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4)
  }
  implicit class Tuple6OfTuple4N2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple4N2N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple4N2N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple4N2N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N2N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N3N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple4N3N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N3N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N3N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple4N4N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple5N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple5N2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3)
  }
  implicit class Tuple6OfTuple5N2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple5N2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple5N2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple5N3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple6OfTuple6N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._1._5,self._1._6,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2)
  }
  implicit class Tuple7OfTuple2N2N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2,self._7._3)
  }
  implicit class Tuple7OfTuple2N2N2N2N2N2N4Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2,self._7._3,self._7._4)
  }
  implicit class Tuple7OfTuple2N2N2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N2N2N3N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._7._1,self._7._2,self._7._3)
  }
  implicit class Tuple7OfTuple2N2N2N2N2N4N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._6._4,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N2N3N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._7._1,self._7._2,self._7._3)
  }
  implicit class Tuple7OfTuple2N2N2N2N3N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._6._3,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N2N4N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._5._4,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N3N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2,self._7._3)
  }
  implicit class Tuple7OfTuple2N2N2N3N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N3N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N2N4N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._4._4,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N3N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2,self._7._3)
  }
  implicit class Tuple7OfTuple2N2N3N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N3N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N3N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N2N4N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._3._4,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N3N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N3N2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2,self._7._3)
  }
  implicit class Tuple7OfTuple2N3N2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N3N2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N3N2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N3N3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple2N4N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._2._3,self._2._4,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple3N2N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple3N2N2N2N2N2N3Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13),(T14,T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2,self._7._3)
  }
  implicit class Tuple7OfTuple3N2N2N2N2N3N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11),(T12,T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._6._3,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple3N2N2N2N3N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9),(T10,T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._5._3,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple3N2N2N3N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7),(T8,T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._4._3,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple3N2N3N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5),(T6,T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._3._1,self._3._2,self._3._3,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple3N3N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3),(T4,T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._2._1,self._2._2,self._2._3,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple7OfTuple4N2N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2,T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._1._3,self._1._4,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2)
  }
  implicit class Tuple8OfTuple2N2N2N2N2N2N2N2Ops[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](private val self: ((T1,T2),(T3,T4),(T5,T6),(T7,T8),(T9,T10),(T11,T12),(T13,T14),(T15,T16))) extends AnyVal {
    def flatten: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) = (self._1._1,self._1._2,self._2._1,self._2._2,self._3._1,self._3._2,self._4._1,self._4._2,self._5._1,self._5._2,self._6._1,self._6._2,self._7._1,self._7._2,self._8._1,self._8._2)
  }
}
