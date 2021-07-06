package xplore.learnings.hackerrank

object SockMerchant {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    println(
      sockMerchant(n, scala.io.StdIn.readLine()
        .split(" ")
        .map(s => s.toInt)
      )
    )
  }
  val sockMerchant: (Int, Array[Int]) => Int = (n: Int, xs: Array[Int]) => {
    val t = xs.take(n)
      .groupBy(id => id)
      .map(t => (t._1, t._2.length))
      .values
      .map(v => v / 2)
      .sum
    t
  }
}
