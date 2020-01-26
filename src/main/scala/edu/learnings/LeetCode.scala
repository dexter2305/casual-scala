package edu.learnings

object LeetCode {

  def main(args: Array[String]): Unit = {
    println(reverseInteger(-210))
    println(reverseInteger(1534236469))
  }

  def reverseInteger(n: Int): Int = {

    def toIntArray(n: Int): Array[Int] = {
      def helper(n: Int, ints: Array[Int]): Array[Int] = {
        if (n < 10) {
          n +: ints
        } else {
          helper(n / 10, (n % 10) +: ints)
        }
      }

      helper(n, Array.emptyIntArray)
    }

    def invert(numbers: Array[Int]): Int = {
      def helper(numbers: Array[Int], index: Int, acc: Int): Int = {
        index == numbers.length - 1 match {
          case true => acc + numbers(index) * Math.pow(10, index).toInt
          case false => helper (numbers, index + 1, acc + numbers(index) * Math.pow(10, index).toInt)
        }
      }
      helper(numbers, 0, 0)
    }

    if (n > Integer.MAX_VALUE) 0
    n > 0 match {
      case true => invert(toIntArray(Math.abs(n)))
      case false => -1 * invert(toIntArray(Math.abs(n)))
    }

  }

}
