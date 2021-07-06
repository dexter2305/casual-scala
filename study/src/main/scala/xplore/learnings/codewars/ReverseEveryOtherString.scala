package xplore.learnings.codewars

class ReverseEveryOtherString {
  def reverse(str: String): String = {
    val strings = str.split(" ").map(_.trim)
    val rsArray = for (i <- 0 to strings.length) yield if (i % 2 == 0) strings(i) else strings(i).reverse
    rsArray.mkString(" ")
  }
}
