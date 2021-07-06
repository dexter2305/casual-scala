package xplore.learnings.hackerrank

class SherlockAndSquares {

  def squares(a: Int, b: Int): Int = {
    val art = math.sqrt(a)
    val brt = math.sqrt(b)
    val res = brt.floor - art.ceil + 1
    res.toInt
  }
}

object SherlockAndSquares {

  def main(args: Array[String]) : Unit = {
    val i = new SherlockAndSquares
    i.squares(100, 1000)
  }
}
