package xplore.learnings.hackerrank

object StairCase {

  def main(args: Array[String]): Unit = {
    staircase(3)
  }

  def staircase(n: Int): Unit = {
    val times: (Int, String) => String = (n, s) => (for (_ <- 0 until n) yield s).foldLeft("")((a, e) => a + e)
    for (i <- 1 to n) {
      val stair = times(i, "#").padTo(n, ' ').reverse
      println(s"$stair")
    }
  }
}
