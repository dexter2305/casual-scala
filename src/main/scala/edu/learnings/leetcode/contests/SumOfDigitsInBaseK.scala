package edu.learnings.leetcode.contests

object SumOfDigitsInBaseK extends App {

  println(s"${sumBase(10, 10)}")
  println(s"${sumBase(42, 2)}")

  def sumBase(n: Int, k: Int): Int = {
    @scala.annotation.tailrec
    def go(number: Int, base: Int, acc: Int): Int = {
      if (number < base) acc + number
      else go(number / base, base, acc + (number % base))
    }

    go(n, k, 0)
  }
}
