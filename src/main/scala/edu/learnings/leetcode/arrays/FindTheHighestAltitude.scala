package edu.learnings.leetcode.arrays

class FindTheHighestAltitude {

  def largestAltitude(gain: Array[Int]): Int = {

    val (m, g) = gain.foldLeft((0, 0))((t, e) => {

      val gm = t._1
      val gg = t._2
      val cg = gg + e
      val (rm, rg) = if (cg >= gm) (cg, cg)
      else (gm, cg)

      //println(s"($gm, $gg) + $e => ($rm, $rg)")
      (rm, rg)
    })

    m
  }
}

object FindTheHighestAltitude extends App {

  val i = new FindTheHighestAltitude
  val input = Array(-4, -3, -2, -1, 4, 3, 2)
  val x = i.largestAltitude(input)
  println(s"$x")

}
