package scalax.collection

/**
  * Copyright xmaples
  * Licensed under Apache License 2.0
  * (http://www.apache.org/licenses/LICENSE-2.0).
  */
object CollectionOps {

  implicit class MaxMinOptionOps[A](private val self: scala.collection.GenTraversableOnce[A]) extends AnyVal {

    def maxByOption[B](f: A => B)(implicit ord: Ordering[B]): Option[A] = if (self.nonEmpty) Option(self.maxBy(f)(ord)) else None

    def minByOption[B](f: A => B)(implicit ord: Ordering[B]): Option[A] = if (self.nonEmpty) Option(self.minBy(f)(ord)) else None

    def maxOption[A1 >: A](implicit ord: Ordering[A1]): Option[A] = if (self.nonEmpty) Option(self.max(ord)) else None

    def minOption[A1 >: A](implicit ord: Ordering[A1]): Option[A] = if (self.nonEmpty) Option(self.min(ord)) else None

  }

  implicit class SeqOps[A](private val self: scala.collection.GenSeq[A]) extends AnyVal {

    def argmax[A1 >: A](implicit ord: Ordering[A1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argmax")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.gt(self(i), self(pi))) pi = i
      }
      pi
    }

    def argmin[A1 >: A](implicit ord: Ordering[A1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argmin")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.lt(self(i), self(pi))) pi = i
      }
      pi
    }

    def argmaxOption[A1 >: A](implicit ordering: Ordering[A1]): Option[Int] = {
      if (self.isEmpty) None else Some(argmax[A1])
    }

    def argminOption[A1 >: A](implicit ordering: Ordering[A1]): Option[Int] = {
      if (self.isEmpty) None else Some(argmin[A1])
    }

    /**
      * `f` will not apply on a single-element array
      */
    def argmaxBy[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argmaxBy")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.gt(f(self(i)), f(self(pi)))) pi = i
      }
      pi
    }

    /**
      * `f` will not apply on a single-element array
      */
    def argminBy[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argminBy")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.lt(f(self(i)), f(self(pi)))) pi = i
      }
      pi
    }

    def argmaxByOption[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Option[Int] = {
      if (self.isEmpty) None
      else Some(argmaxBy[B, B1](f)(ord))
    }

    def argminByOption[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Option[Int] = {
      if (self.isEmpty) None
      else Some(argminBy[B, B1](f)(ord))
    }

  }

  implicit class ArrayOps[A](private val self: Array[A]) extends AnyVal {

    def argmax[A1 >: A](implicit ord: Ordering[A1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argmax")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.gt(self(i), self(pi))) pi = i
      }
      pi
    }

    def argmin[A1 >: A](implicit ord: Ordering[A1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argmin")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.lt(self(i), self(pi))) pi = i
      }
      pi
    }

    def argmaxOption[A1 >: A](implicit ordering: Ordering[A1]): Option[Int] = {
      if (self.isEmpty) None else Some(argmax[A1])
    }

    def argminOption[A1 >: A](implicit ordering: Ordering[A1]): Option[Int] = {
      if (self.isEmpty) None else Some(argmin[A1])
    }

    /**
      * `f` will not apply on a single-element array
      */
    def argmaxBy[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argmaxBy")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.gt(f(self(i)), f(self(pi)))) pi = i
      }
      pi
    }

    /**
      * `f` will not apply on a single-element array
      */
    def argminBy[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Int = {
      if (self.isEmpty)
        throw new UnsupportedOperationException("empty.argminBy")
      var pi = 0
      for (i <- 1 until self.length) {
        if (ord.lt(f(self(i)), f(self(pi)))) pi = i
      }
      pi
    }

    def argmaxByOption[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Option[Int] = {
      if (self.isEmpty) None
      else Some(argmaxBy[B, B1](f)(ord))
    }

    def argminByOption[B, B1 >: B](f: A => B)(implicit ord: Ordering[B1]): Option[Int] = {
      if (self.isEmpty) None
      else Some(argminBy[B, B1](f)(ord))
    }

  }
}
