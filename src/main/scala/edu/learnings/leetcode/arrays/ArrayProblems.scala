package edu.learnings.leetcode.arrays

object ArrayProblems {

  // https://leetcode.com/problems/create-target-array-in-the-given-order/
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    var targetArray = Array[Int]()
    for (i <- index.indices) {
      println(s"insert ${nums(i)} at position ${index(i)} in target array")
      val (l, r) = targetArray.splitAt(index(i))
      targetArray = (l :+ nums(i)) ++ r

    }
    targetArray
  }

  //https://leetcode.com/explore/learn/card/array-and-string/201/introduction-to-array/1144/
  def pivotIndex(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def go(numbers: Array[Int], i: Int, lSum: Int, total: Int): Int = {
      i match {
        case index if index < numbers.length => if (lSum == total - numbers(i) - lSum) i
        else go(numbers, i + 1, lSum + numbers(i), total)
        case _ => -1
      }
    }

    go(nums, 0, 0, nums.sum)
  }
}
