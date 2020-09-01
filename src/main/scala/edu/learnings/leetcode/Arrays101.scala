package edu.learnings.leetcode

class Arrays101 {

  def findMaxConsecutiveOnes(arr: Array[Int]): Int = {
    val (runningValue, max) = arr.foldLeft((0, 0))((tuple, e) => e match {
      case 1 => (tuple._1 + 1, tuple._2)
      case 0 =>
        println(s"${arr.mkString(" ")} for $tuple")
        if (tuple._1 > tuple._2) (0, tuple._1) else (0, tuple._2)
    })
    Math.max(runningValue, max)
  }

  def findNumbersWithEvenNumberOfDigits(nums: Array[Int]): Int = {
    val digitCount: Int => Int = n => {
      @scala.annotation.tailrec
      def helper(n: Int, c: Int = 0): Int = {
        if (n / 10 > 0) helper(n / 10, c + 1)
        else c + 1
      }

      helper(n)
    }
    nums.count(digitCount(_) % 2 == 0)
  }
}

object Arrays101 {
  def main(args: Array[String]): Unit = {
    val t = new Arrays101
    println(t.findNumbersWithEvenNumberOfDigits(Array(123, 1234, 0, 979078)))
  }
}