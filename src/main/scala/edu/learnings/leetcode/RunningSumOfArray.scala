package edu.learnings.leetcode

object RunningSumOfArray {

  def main(args: Array[String]): Unit = {

    println(s"${runningSum(Array(100, 1, 2)).mkString(" ")}")
  }

  def runningSum(nums: Array[Int]): Array[Int] = {
    nums.slice(1, nums.length)
      .foldLeft(Array(nums(0)))((csum: Array[Int], e) => csum :+ csum(csum.length - 1) + e)
  }
}
