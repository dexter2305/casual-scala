package edu.learnings.hackerrank

class MarsExploration {

  def marsExploration(s: String): Int = {
    val asChars = s.toCharArray
    val diffs: Seq[Int] = for (i <- s.indices) yield {
      i % 3 match {
        case 0 | 2 if asChars(i) == 'S' => 0
        case 1 if asChars(i) == 'O' => 0
        case _ => println(s"char($i): ${asChars(i)}")
          1
      }
    }
    diffs.sum
  }


}

object MarsExploration {

  def main(args: Array[String]): Unit = {
    val i = new MarsExploration
    val x = "SSSSSSSSSSSSSSSOOOOOOOOOOOOOOOOOOOOOOOOOSSSSSSSO"
    println(s"d = ${i.marsExploration(x)}")
  }
}