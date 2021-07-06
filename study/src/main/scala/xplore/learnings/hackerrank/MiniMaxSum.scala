package xplore.learnings.hackerrank

object MiniMaxSum {

  def main(args: Array[String]): Unit = {

    miniMaxSum(Array(1, 2, 3, 4, 5))
  }

  def miniMaxSum(arr: Array[Int]): Unit = {
    println(getVal(arr))
  }

  def getVal(arr: Array[Int]): String = {
    val sorted = arr.map(_.toLong).sorted
    s"${sorted.take(4).sum} ${sorted.reverse.take(4).sum}"
  }
}
