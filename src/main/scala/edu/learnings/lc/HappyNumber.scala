//HappyNumber.scala
package edu.learnings.lc

object HappyNumber {

  def isHappy(n: Int): Boolean = {
    println(s"Checking for $n")
    def helper(slow: Int, fast: Int): Boolean = {
      println(s"($slow, $fast)")

      if (fast == 1) true
      else 
        slow == fast match {
        case true => slow == 1
        case false => helper(sumOfSquaredDigits(slow), sumOfSquaredDigits(sumOfSquaredDigits(fast)))
        }
    }

    val res = helper(sumOfSquaredDigits(n), sumOfSquaredDigits(sumOfSquaredDigits(n)))
    //val res = helper(slow(n), fast(n))
    println(s"$res")
    res
  }

  def sumOfSquaredDigits(n: Int): Int = {
    def helper(n: Int, acc: Int): Int = {
      n < 10 match {
        case true => acc + n * n
        case false => helper(n / 10, acc + Math.pow(n % 10, 2).toInt)
      }
    }
    helper(n, 0)
  }
}

object HappyNumberApp {
  def main(args: Array[String]): Unit = {
    HappyNumber.isHappy(19)
  }
}