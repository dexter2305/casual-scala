package edu.learnings.lc

object MaxProfit {
   def maxProfit(prices: Array[Int]): Int = {
    val x = for (i <- 1 until prices.length) yield {
      val x = prices(i) - prices(i-1)
      //println(s"${prices(i)} - ${prices(i-1)} = $x")
      x
    }
    x.filter(e => e > 0).sum
  }
}
