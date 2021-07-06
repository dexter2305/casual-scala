package xplore.learnings.hackerrank

import scala.annotation.tailrec

object StringSplit {
  def main(args: Array[String]): Unit = {
    println("# of tests")
    val n = scala.io.StdIn.readInt()
    println(s"enter $n strings")
    val inputStrings = for (_ <- 0 until n) yield scala.io.StdIn.readLine
    inputStrings.map(s => splitString(s)).foreach(println(_))
  }

  def splitString(input: String): String = {
    @tailrec
    def helper(input: String, index: Int, evenAcc: String, oddAcc: String): (String, String) = {
      if (index < input.length)
        index % 2 match {
          case 0 => helper(input, index + 1, evenAcc + input.charAt(index), oddAcc)
          case 1 => helper(input, index + 1, evenAcc, oddAcc + input.charAt(index))
        }
      else (evenAcc, oddAcc)
    }

    if (input.isEmpty) ""
    else {
      val (e, o) = helper(input, 0, "", "")
      e + " " + o
    }
  }
}
