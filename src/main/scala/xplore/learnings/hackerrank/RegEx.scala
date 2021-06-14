package xplore.learnings.hackerrank

object RegEx {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    val table = (for (_ <- 0 until n) yield scala.io.StdIn.readLine().split(" ").take(2)).map(strArr => (strArr(0),strArr(1))).toList
    //println(table)
    applyFilter(table).foreach(println)
  }

  def applyFilter(tuples: List[(String, String)]): List[String] = {
    val regex = raw"""@gmail.com""".r
    tuples.filter(tuple => regex.unanchored.matches(tuple._2))
      .map(tuple => tuple._1)
      .sorted
  }
}
