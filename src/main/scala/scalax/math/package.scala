package scalax

/**
  * Copyright xmaples
  * Licensed under Apache License 2.0
  * (http://www.apache.org/licenses/LICENSE-2.0).
  */
package object math {

  def argmax[A, A1 >: A](values: Array[A])(implicit ordering: Ordering[A1]): Int = {
    require(values.nonEmpty)
    var maxi=0
    for (i <- 1 until values.length) {
      if (ordering.gt(values(i), values(maxi))) maxi = i
    }
    maxi
  }

  def argmax[A, A1 >: A](values: scala.collection.Seq[A])(implicit ordering: Ordering[A1]): Int = {
    require(values.nonEmpty)
    var maxi = 0
    for (i <- 1 until values.length) {
      if (ordering.gt(values(i), values(maxi))) maxi = i
    }
    maxi
  }

  def argmin[A, A1 >: A](values: Array[A])(implicit ordering: Ordering[A1]): Int = {
    require(values.nonEmpty)
    var mini = 0
    for (i <- 1 until values.length) {
      if (ordering.lt(values(i), values(mini))) mini = i
    }
    mini
  }

  def argmin[A, A1 >: A](values: scala.collection.Seq[A])(implicit ordering: Ordering[A1]): Int = {
    require(values.nonEmpty)
    var mini = 0
    for (i <- 1 until values.length) {
      if (ordering.lt(values(i), values(mini))) mini = i
    }
    mini
  }

}
