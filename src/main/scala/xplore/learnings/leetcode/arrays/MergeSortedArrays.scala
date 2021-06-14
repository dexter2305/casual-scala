package xplore.learnings.leetcode.arrays

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
 */
class MergeSortedArrays {
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {

    @scala.annotation.tailrec
    def go(x: Array[Int], y: Array[Int], i: Int, j: Int, k: Int): Array[Int] = {
      if (i >= 0 && j >= 0) {
        print(s"($i,$j) of ${x(i)} vs ${y(j)} | ${x.mkString(" ")} && ${y.mkString(" ")} => ")
        if (x(i) >= y(j)) {
          x(k) = x(i)

          println(s"${x.mkString(" ")}  | ${y.mkString(" ")}")
          go(x, y, i - 1, j, k - 1)
        } else {
          x(k) = y(j)
          println(s"${x.mkString(" ")} | ${y.mkString(" ")}")
          go(x, y, i, j - 1, k - 1)
        }
      } else {
        nums2.copyToArray(nums1,0, j + 1)
        nums1
      }
    }
    go(nums1, nums2, m - 1, n - 1, m + n - 1)
  }
}

object MergeSortedArrays extends App {
  val i = new MergeSortedArrays
  val x = Array(2,4,6,0,0,0,0)
  val y = Array(1,3,7,9)
  i.merge(x, 3, y, 4)
  assert(x sameElements  Array(1, 2, 3, 4, 6, 7, 9))
}
