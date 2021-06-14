package xplore.learnings.hackerrank

object Factorial {

  def main(args: Array[String]): Unit = {
    val n = scala.io.StdIn.readInt()
    println(s"factorial($n):${factorial(n)}")
  }

  def factorial(n: Int): Int = {
    @scala.annotation.tailrec
    def helper(n: Int, acc: Int =1): Int = {
      n match {
        case 0 => 1
        case 1 => acc
        case _ => helper(n -1, n * acc)
      }
    }
    helper(n)
  }
}
