package edu.learnings

object Lc1295 {
  def main(args: Array[String]): Unit = {
    println(countOfNWithEvenNumberOfDigits(Array(1230)))
  }

  def countOfNWithEvenNumberOfDigits(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def digitCount(n: Long, count: Int = 0): Int = {
      n match {
        case 0 => count + (if (n % 10 > 0) 1 else 0)
        case _ => digitCount(n / 10, count + 1)
      }
    }
    nums.count(n => digitCount(n) % 2 == 0)
  }
}
