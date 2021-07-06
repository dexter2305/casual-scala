package com.packt.falgo

object DecimalToInteger extends App {

  val n = List(1,2,3)
  println(s"${
    Iterator.iterate(2)(n => {
      println(s"n => $n")
      n * n
    }).take(1).toList
  }")
  println(s"${decimalToBinaryByRecursion(9)}")

  def decimalToBinaryByRecursion(n: Int): String = {
    @scala.annotation.tailrec
    def go(n: Int, acc: String): String = {
      if (n < 2) n + acc else go(n / 2, (n % 2) + acc)

    }

    go(n, "")
  }

}
