package xplore.learnings.codewars

class CountVowels {

  def getCount(s: String): Int = {
    s.toCharArray map(_.toString) count {
      case "a" | "e" | "i" | "o" | "u" => true
      case _ => false
    }
  }
}
