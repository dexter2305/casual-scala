package edu.learnings.hackerrank

object AngryProfessor {
  def angryProfessor(min: Int, time: Array[Int]): String = {
    if (time.count(_ <= 0) < min) "YES"
    else "NO"
  }
}
