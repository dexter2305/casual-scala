package xplore.learnings.hackerrank

class AlternatingCharacters {

  def alternatingCharacters(s: String): Int = {

    val (_, deleteCounter) = s.toCharArray.foldLeft((' ', 0))((t, e) => {
     val x:(Char, Int) = if (e equals t._1) (t._1, t._2 + 1)
      else (e, t._2)
      //println(s"char: $e & acc: $x")
      x
    })
    deleteCounter
  }
}

object AlternatingCharacters {
  def main(args: Array[String]): Unit = {
    val i = new AlternatingCharacters
    val r = i.alternatingCharacters("AAB")
    println(s"$r")
  }
}
