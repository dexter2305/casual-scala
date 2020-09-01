package edu.learnings.leetcode

object CountingElements {
  def main(args: Array[String]): Unit = {
    countingElements(Array(1, 2, 3))
  }

  def countingElements(arr: Array[Int]): Int = {
    val givenSet = arr.toSet
    arr.map(_ + 1).count(e => givenSet.contains(e))
  }
}
