package edu.learnings.leetcode

class ShuffleTheArray {

  def shuffle(nums: Array[Int], n: Int): Array[Int] = {
    val (xArray, yArray) = nums.splitAt(n)
    val seq = (for (i <- 0 until n) yield {
      (xArray(i), yArray(i))
    }).flatMap(t => List(t._1, t._2))
    //println(s"${seq.mkString(" ")}")
    seq.toArray
  }
}
