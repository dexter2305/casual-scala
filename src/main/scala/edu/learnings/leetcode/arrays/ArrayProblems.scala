package edu.learnings.leetcode.arrays

object ArrayProblems {

  /* https://leetcode.com/problems/create-target-array-in-the-given-order/
   */
  def createTargetArray(nums: Array[Int], index: Array[Int]): Array[Int] = {
    var targetArray = Array[Int]()
    for (i <- index.indices) {
      println(s"insert ${nums(i)} at position ${index(i)} in target array")
      val (l, r) = targetArray.splitAt(index(i))
      targetArray = (l :+ nums(i)) ++ r

    }
    targetArray
  }
}
