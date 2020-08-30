package edu.learnings.hackerrank

object CountingValleys {

  def main(args: Array[String]): Unit = {
    val s = "DDDUUUDDUUUUDDDU"
    println(s"input '$s' has ${countingValleys(s.length, s)} steps")
  }

  def countingValleys(n: Int, s: String): Int = {

    val (_, valleyCount) = s.take(n)
      .toCharArray
      .foldLeft((0, 0))((acc, e) => {
        e match {
          case 'U' if acc._1 + 1 == 0 => (acc._1 + 1, acc._2 + 1)
          case 'U' if acc._1 + 1 != 0 => (acc._1 + 1, acc._2)
          case 'D' => (acc._1 - 1, acc._2)
        }
      })
    valleyCount
  }
}
