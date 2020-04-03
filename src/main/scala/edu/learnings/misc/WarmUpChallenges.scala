package edu.learnings

object WarmUpChallenges {

  def main(args: Array[String]): Unit = {
    println("repeatedStrings:" + repeatedString("aba", 10))

  }

  def repeatedString(s: String, n: Long): Long = {
    val times = n / s.length
    n % s.length match {
      case 0 => times * s.count(x => x == 'a')
      case _ => (times * s.count(x => x == 'a')) + s.substring(0, (n % s.length).toInt).count(x => x.equals('a'))
    }
  }

}
