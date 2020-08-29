package edu.learnings.hackerrank

object UtopianTree {

  def main(args: Array[String]): Unit = {
    println(utopianTree(4))
  }

  def utopianTree(n: Int): Int = {

    (0 until n).foldLeft(1)((acc: Int, c: Int) => {
      val x = if (c % 2 == 0) acc * 2 else acc + 1
      println(s"$c : $acc")
      x
    })
  }

}
