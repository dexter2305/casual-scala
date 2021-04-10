package edu.learnings.leetcode.arrays

object HeightChecker extends App {
  val l = Array(1,1,4,2,1,3)
  println(s"${heightChecker(Array(1,1,4,2,1,3))}")
  def heightChecker(heights: Array[Int]): Int = {
    val sorted = heights.sorted
    println(s"${heights.mkString(",")} \n${sorted.mkString(",")}")
    heights.zip(sorted).map(t => t._1 - t._2).count( _ != 0)
  }

}
