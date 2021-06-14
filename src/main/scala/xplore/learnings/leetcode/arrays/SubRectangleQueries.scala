package xplore.learnings.leetcode.arrays

class SubRectangleQueries(_rectangle: Array[Array[Int]]) {

  def updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
    for (r <- row1 to row2; c <- col1 to col2) {
      val current = _rectangle(r)(c)
      _rectangle(r)(c) = newValue
    }
  }

  def getValue(row: Int, col: Int): Int = {
    _rectangle(row)(col)
  }

  def print(): Unit = {
    for (row <- _rectangle) {
      println(s"${row.mkString(" ")}")
    }
  }

}

object SubRectangleQueries {
  def main(args: Array[String]): Unit = {
    val i = new SubRectangleQueries(Array(Array(1, 2, 1), Array(4, 3, 4), Array(3, 2, 1), Array(1, 1, 1)))
    i.print()
    i.updateSubrectangle(0, 0, 3, 2, 100)
    i.print()
  }
}