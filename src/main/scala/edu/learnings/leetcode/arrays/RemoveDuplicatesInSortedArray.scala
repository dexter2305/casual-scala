package edu.learnings.leetcode.arrays

object RemoveDuplicatesInSortedArray extends App {

  val l = Array(1,1,1,2)
  val n = removeDuplicates(l)
  println(s"${l.mkString("-")} and length: $n")
  assert(n == 4)

  def removeDuplicates(nums: Array[Int]): Int = {
    @scala.annotation.tailrec
    def go(a: Array[Int], tracker: Int, parser: Int): Int = {
      if (parser < a.length) {
        if (a(parser) == a(tracker)) go(a, tracker, parser + 1)
        else {
          a(tracker + 1) = a(parser)
          go(a, tracker + 1, parser + 1)
        }
      } else {
        tracker + 1
      }
    }
    if (nums.isEmpty) 0 else go(nums, 0, 0)
  }
}
