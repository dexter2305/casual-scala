package xplore.learnings.hackerrank

object DrawingBook {

  def main(args: Array[String]): Unit = {
    pageCount(11, 4)
  }

  def pageCount(n: Int, p: Int): Int = {
    val tf = p / 2
    val tt = n / 2
    Math.min(tt-tf, tf)
  }
}
