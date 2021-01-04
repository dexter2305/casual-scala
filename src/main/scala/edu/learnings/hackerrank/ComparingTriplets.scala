package edu.learnings.hackerrank

class ComparingTriplets {

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {

    val rss = for (i <- a.indices) yield {
      a(i) - b(i) match {
        case diff if diff < 0 => 1
        case diff if diff > 0 => -1
        case _ => 0
      }
    }
    Array(rss.count(_ > 0), rss.count(_ < 0))
  }

}
