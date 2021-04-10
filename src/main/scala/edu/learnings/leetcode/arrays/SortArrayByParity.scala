package edu.learnings.leetcode.arrays

object SortArrayByParity extends App {

  val l = Array(1,3,2,4)
  println(s"${sortArrayByParity(l).mkString(",")}")

  def sortArrayByParity(data: Array[Int]): Array[Int] = {
    @scala.annotation.tailrec
    def go(a: Array[Int], tracker: Int, parser: Int): Array[Int] = {
      if (tracker < a.length && parser < a.length) {
        if (a(tracker) % 2 == 0) go(a, tracker + 1, tracker + 1)
        else {
          if (a(parser) % 2 == 0) {
            val x = a(tracker)
            a(tracker) = a(parser)
            a(parser) = x
            go(a, tracker + 1, tracker + 1)
          } else go(a, tracker, parser + 1)
        }
      }else a
    }

    go(data, 0, 0)
  }

}
