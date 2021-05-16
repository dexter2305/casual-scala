package edu.learnings.leetcode.strings

object ColorOfChessBoardSquare extends App {

  println(s"${squareIsWhite("a1")}")
  assert(squareIsWhite("a2"))
  assert(squareIsWhite("a1") == false)
  /*
      a1 => a + 1 => 1 + 1 => 2 => isEven => Black
      a2 => a + 2 => 1 + 2 => 3 => isOdd => White
   */
  def squareIsWhite(coordinates: String): Boolean = {
    val weights: Map[Char, Int] = ('a' to 'h').zipWithIndex.map(t => (t._1, t._2 + 1)).toMap
    val isWhite = (coordinates(0),coordinates(1).toInt) match {
      case (char, int) => (weights(char) + int) % 2 != 0
    }
    isWhite
  }
}
