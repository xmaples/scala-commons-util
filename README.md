# commons-util

#### Description

Extensions & utilities for Scala 2.13.

#### Installation

1. Clone repository
```bash
git clone -b s2.13 https://github.com/xmaples/commons-util.git
#or git clone -b s2.13 https://gitee.com/xmaples/commons-util.git
```

2. Build & install to maven local(& private remote) repository
```bash
cd commons-util
mvn install    # installing to local repository
#mvn deploy     # installing to local & private remote repository if configured private remote repo
```

3. Add dependency into your `pom.xml`
```xml
<dependency>
    <groupId>com.github.xmaples.commons</groupId>
    <artifactId>commons-util_2.13</artifactId>
    <version>LATEST</version>
</dependency>
```

### How to Use

1. **Tuples**. `:+` / `append()`, `+:` / `prepend()`, `++`, `reverse`, `head`, `last`, `init`, `tail`, `::`, `:::`, `length`.

```scala
import scalax.TupleOps._

val t2: (Int,Int) = (1,2)

val t3a: (Int,Int,String) = t2 :+ "x3"
assert(t3a == (1,2,"x3"))
assert(t3a.last == "x3")
assert(t3a.init == t2)

val t3p: (String,Int,Int) = "x0" +: t2
assert(t3p == ("x0",1,2))
assert(t3p.head == "x0")
assert(t3p.tail == t2)

val pp:(Int,Int,String,String) = t2 ++ ("x3","x4")
assert(pp==(1,2,"x3","x4"))
assert((1,2).:::(("x3","x4")) == ("x3","x4",1,2))
assert(("x3","x4").length == 2)
assert((1,"x2").reverse==("x2",1))
```

2. **Homogeneous Tuples**. `map`, `foreach`, `apply`, `toArray/toList`, `exists`, `forall`, `reduce`, `fold`, `find`.

```scala
import scalax.TupleOps._

val ht2:(String,String)=("x1","x2")
assert(ht2.map(_.length)==(2,2))
assert(ht2(0)=="x1" && ht2(1)=="x2")
assert(ht2.toList == List("x1","x2"))
assert(ht2.forall(_.startsWith("x")))
assert(ht2.exists(_.endsWith("2")))

val ht2i:(Int,Int,Int)=(2,3,5)
assert(ht2i.sum == 10)
assert(ht2i.reduce((v1,v2)=>v1*v2)==30)
```

3. **Tuples Flattening**. `flatten`.

```scala
import scalax.TupleOps._

val a:(Tuple2[Int,String],Tuple3[String,Int,Int]) = ((1,"x2"),("x3",4,5))
val b:Tuple5[Int,String,String,Int,Int] = a.flatten
assert(b == (1,"x2","x3",4,5))
```

4. **Seq/Array**. `argmax`, `argmin`, `argmaxOption`, `argminOption`, `argmaxBy`, `argminBy`, `argmaxByOption`, `argminByOption`.

```scala
import scalax.collection.CollectionOps._

assert(Array(8,7,7,9,9).argmin == 1)
assert(List(8,7,7,9,9).argmin == 1)
assert(List(8,7,7,9,9).argmax == 3)
assert(List.empty[Int].argmaxOption == None)
assert(List("bb","","ccc").argmaxBy(_.length)==2)
assert(List("bb","","ccc").argminBy(_.length)==1)
```
