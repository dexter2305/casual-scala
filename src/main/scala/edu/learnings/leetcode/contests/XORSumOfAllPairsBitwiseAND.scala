package edu.learnings.leetcode.contests

object XORSumOfAllPairsBitwiseAND extends App {
  val a = Array(12)
  val b = Array(4)
  val ans = getXORSum(a, b)
  println(ans)

  def getXORSum(arr1: Array[Int], arr2: Array[Int]): Int = {

    arr1.reduce((x, y) => x ^ y) & arr2.reduce((x, y) => x ^ y)

  }

}