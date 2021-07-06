package xplore.learnings.leetcode.recursion

object ReverseString extends App {

  val data = Array('c', 'a', 'r')
  reverseString(data)
  println(s"${data.mkString("-")}")

  def reverseString(s: Array[Char]): Unit = {
    @scala.annotation.tailrec
    def swap(array: Array[Char], i: Int, j: Int): Unit = {
      if (i <= j) {
        val x = array(i)
        array(i) = array(j)
        array(j) = x
        swap(array, i + 1, j - 1)
      }
    }
    swap(s, 0, s.length - 1)
  }
}
