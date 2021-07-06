package xplore.learnings.hackerrank

class BirthdayCakeCandles {

  def birthdayCakeCandles(candles: Array[Int]): Int = {
    val g = candles.groupBy(identity)
    g(g.keys.max).length

  }
}

object BirthdayCakeCandles {
  def main(args: Array[String]) : Unit = {
    val i = new BirthdayCakeCandles
    i.birthdayCakeCandles(Array(4,3,2,1))
  }
}
