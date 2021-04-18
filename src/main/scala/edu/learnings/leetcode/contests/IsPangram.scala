package edu.learnings.leetcode.contests

object IsPangram extends App {
  val q = "thequickbrownfoxjumpsoverthelazydog"
  println(s"${checkIfPangram(q)}")

  def checkIfPangram(sentence: String): Boolean = {
    val s =('a' to 'z').toSet[Char].intersect(sentence.toCharArray.toSet[Char])
    s.size == 26
  }

  def checkIfPangramOld(sentence: String): Boolean = {
    if (sentence.length < 26) false
    else {
      var b = true
      val chars = sentence.toSet
      for (i <- 'a' to 'z'; if b){
        //println(i)
        b = chars.contains(i)
      }
      b
    }
  }
}
