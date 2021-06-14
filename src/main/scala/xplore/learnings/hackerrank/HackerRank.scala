package xplore.learnings.hackerrank

object HackerRank extends App {

  println(s"${catAndMouse(1, 3, 2)}")

  def catAndMouse(x: Int, y: Int, z: Int): String = {
    val xz: Int = math.abs(z - x)
    val yz: Int = math.abs(z - y)
    if (xz == yz) "Mouse C"
    else if (xz < yz) "Cat A"
    else "Cat B"
  }

  def hurdleRace(k: Int, height: Array[Int]): Int = {
    height.max - k match {
      case n: Int if n > 0 => n
      case _ => 0
    }
  }

  def reverseWordsInAString(s: String): String = {
    s.split(" ").filter(_.trim.nonEmpty).map(s => {
      val x = s
      println(s"given '$s' => '$x'")
      x
    }).reverse.mkString(" ")
  }

  def breakingRecords(scores: Array[Int]): Array[Int] = {

    val minRecord = scores(0)
    val maxRecord = minRecord
    val (minCounter, maxCounter) = scores.slice(1, scores.length)
      .foldLeft(0, 0)((tuple, e) => if (e < minRecord) (tuple._1 + 1, tuple._2) else if (e > maxRecord) (tuple._1, tuple._2 + 1) else (tuple._1, tuple._2))
    println(s"Counter $minCounter, $maxCounter")
    Array(minCounter, maxCounter)
  }
}
