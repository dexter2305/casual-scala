package edu.learnings.leetcode

class MaxNumberOfKSumPairs {
  def maxOperations(nums: Array[Int], k: Int): Int = {

    @scala.annotation.tailrec
    def go(array: Array[Int], left: Int, right: Int, acc: Int): Int = {
      //println(s"${array.mkString(" ")} l: ${array(left)}, r: ${array(right)}, acc: $acc")
      if (left < right) {

        array(left) + array(right) match {
          case v if v == k => go(array, left + 1, right - 1, acc + 1)
          case v if v > k => go(array, left, right - 1, acc)
          case v if v < k => go(array, left + 1, right, acc)
        }
      } else acc
    }

    go(nums.sorted, 0, nums.length - 1, 0)
  }
}
