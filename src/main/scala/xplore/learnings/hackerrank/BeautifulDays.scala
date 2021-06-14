package xplore.learnings.hackerrank

object BeautifulDays {
  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    if (k == 0) 0
    else {
      val reverse: Int => Int = x => x.toString.reverse.toInt
      val dates = i to j map (i => (i, reverse(i))) map (x => Math.abs(x._1 - x._2))
      println(s"$dates & $k")
      dates count (_ % k == 0)

    }
  }
}
