package com.packt.falgo

class FibonacciGenerator {
  def generate(total: Int): List[Int] = {
    lazy val fibSeries: LazyList[Int] = LazyList.cons(1,
      LazyList.cons(1, fibSeries.zip(fibSeries.tail).map { t => t._1 + t._2 }))
    fibSeries.take(total).toList
  }
}
