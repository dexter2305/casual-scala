package xplore.learnings.leetcode

/**
  Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not
  the kth distinct element.

  Example 1:
  Input: [3,2,1,5,6,4] and k = 2
  Output: 5

  Example 2:
  Input: [3,2,3,1,2,4,5,5,6] and k = 4
  Output: 4

  Note:
  You may assume k is always valid, 1 ≤ k ≤ array's length.

 */
class FindKthLargestElementInUnsortedArray {

  def findKthLargest(nums: Array[Int], k: Int): Int = {
    subOptimalSolution(nums, k)
  }

  def subOptimalSolution(nums: Array[Int], k: Int): Int = {
    val x:Array[Int] = nums.sorted.reverse
    //for (i <- x.indices) (println(s"arr($i) = ${x(i)}"))
    x(k-1)
  }
}
