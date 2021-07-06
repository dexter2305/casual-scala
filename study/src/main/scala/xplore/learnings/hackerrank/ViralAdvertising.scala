package xplore.learnings.hackerrank

class ViralAdvertising {
  def viralAdvertising(n: Int): Int = {

    def like(start: Long): LazyList[Long] = {
      val liked = start / 2
      val received = liked * 3
      liked #:: like(received)
    }

    like(5).take(n).sum.toInt
  }
}

object ViralAdvertising {
  def main(args: Array[String]): Unit = {
    val viralAdvertising = new ViralAdvertising
    val n = 4
    println(s"n:$n & answer: ${viralAdvertising.viralAdvertising(n)}")
  }
}
