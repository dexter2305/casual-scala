package edu.learnings.hackerrank

class SaveThePrisoner {

  def saveThePrisoner(n: Int, m: Int, s: Int): Int = {
    val r = (m % n) - 1
    (r + s) % n match {
      case 0 => n
      case x => x
    }
  }
}
