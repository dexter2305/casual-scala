package edu.learnings.hackerrank

object Prime {
  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    (for (_ <- 1 to n) yield scala.io.StdIn.readInt()).map(n => isPrime(n))
      .map {
        case true => "Prime"
        case false => "Not prime"
      }.foreach(println(_))
  }

  def isPrime(n: Int): Boolean = {
    n match {
      case 0 | 1  => false
      case 2 => true
      case _ =>
        val sqrt = Math.sqrt(n).toInt + 1
        !(2 to sqrt).exists(n % _ == 0)
    }
  }
}
