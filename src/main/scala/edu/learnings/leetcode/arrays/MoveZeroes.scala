package edu.learnings.leetcode.arrays

object MoveZeroes extends App {

  val l = Array(0, 1, 0, 3, 12)
  moveZeroes(l)
  println(s"${l.mkString(",")}")


  def moveZeroes(nums: Array[Int]): Unit = {
    @scala.annotation.tailrec
    def go(a: Array[Int], tracker: Int, parser: Int): Unit = {
      if (tracker < a.length && parser < a.length) {
        if (a(tracker) != 0) go(a, tracker + 1, tracker + 1)
        else {
          if (a(parser) == 0) go(a, tracker, parser + 1)
          else {
            a(tracker) = a(parser)
            a(parser) = 0
            go(a, tracker + 1, tracker + 1)
          }
        }
      }
    }
    go(nums, 0, 0)
  }
}
