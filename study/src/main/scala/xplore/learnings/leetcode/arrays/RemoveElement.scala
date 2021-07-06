package xplore.learnings.leetcode.arrays

object RemoveElement extends App {

  val l = Array(3, 2, 2, 3)
  val length = removeElement(l, 3)
  println(s"l = $length && ${l.take(length).mkString("-")}")

  def removeElement(nums: Array[Int], `val`: Int): Int = {

    @scala.annotation.tailrec
    def go(a: Array[Int], s: Int, tracker: Int, parser: Int): Int = {
      if (tracker < a.length && parser < a.length) {
        if (a(tracker) != s) go(a, s, tracker + 1, parser + 1)
        else {
          if (a(parser) == s) go(a, s, tracker, parser + 1)
          else {
            a(tracker) = a(parser)
            a(parser) = s
            go(a, s, tracker + 1, tracker + 1)
          }
        }
      } else {
        tracker
      }
    }

    if (nums.isEmpty) 0 else go(nums, `val`, 0, 0)
  }
}
