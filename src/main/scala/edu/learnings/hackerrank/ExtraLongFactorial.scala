package edu.learnings.hackerrank

class ExtraLongFactorial {

  def extraLongFactorials(n: Int) {

    val x: BigInt = (2 to n).foldLeft(1: BigInt)((acc, e) => acc * e)

    println(s"$x")
  }
}

object ExtraLongFactorial{

  def main(args: Array[String]): Unit = {
    val i = new ExtraLongFactorial
    i.extraLongFactorials(5)
  }
}