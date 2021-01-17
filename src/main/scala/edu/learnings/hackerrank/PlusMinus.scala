package edu.learnings.hackerrank

class PlusMinus {

  def plusMinus(arr: Array[Int]): Unit = {
    val (p: Double, m: Double, z: Double) = arr.foldLeft(0.0, 0.0, 0.0)((t, e) => e match {
      case x if x > 0 => (t._1 + 1, t._2, t._3)
      case x if x < 0 => (t._1, t._2 + 1, t._3)
      case x if x == 0 => (t._1, t._2, t._3 + 1)
    })

    println(f"${p / arr.length}%.6f")
    println(f"${m / arr.length}%.6f")
    println(f"${z / arr.length}%.6f")

  }
}

object PlusMinus {

  def main(args: Array[String]): Unit = {
    val i = new PlusMinus
    i.plusMinus(Array(1, 1, 0, -1, -1))
  }
}
