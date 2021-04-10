package edu.learnings.leetcode.arrays

object ReplaceWithGreatestToRight extends App {

  val l = Array(17, 18, 5, 4, 6, 1)

  val a = replaceElements(l)
  println(s"${a.mkString(",")}")
  assert(a.sameElements(Array(18, 6, 6, 6, 1, -1)))

  def replaceElements(arr: Array[Int]): Array[Int] = {
    @scala.annotation.tailrec
    def go(n: Array[Int], index: Int, currentMax: Int): Array[Int] = {
      if (index < 0) n
      else {
        val newMax = math.max(n(index), currentMax)
        n(index) = currentMax
        go(n, index - 1, newMax)
      }
    }
    go(arr, arr.length - 1, -1)
  }

}
