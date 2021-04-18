package edu.learnings.leetcode.contests

object MaxIceCreamBars extends App {

  val l = Array(1,3,2,4,1)
  println(s"${maxIceCream(l, 7)}")

  def maxIceCream(costs: Array[Int], coins: Int): Int = {
    val sortedCosts = costs.sorted
    var c = 0
    var left = coins
    println(s"${sortedCosts.mkString("-")} & coins: $coins")

    for (e <- sortedCosts if left > 0) {
      if (e <= left) {

        c += 1
        left -= e
        println(s"bought: $e total: $c left: $left")
      }
    }
    c
  }
}
