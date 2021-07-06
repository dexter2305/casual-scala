package xplore.learnings.leetcode


class LongestPalindromicSubstring {

  def longestPalindrome(s: String): String = {
    ???
  }


  def longestPalindromeUsingSlider(s: String): String = {
    def isPalindrome(string: String): Boolean = {
      @scala.annotation.tailrec
      def go(chars: Array[Char], i: Int): Boolean = {
        if (i == chars.length) true
        else if (chars(i).equals(chars(chars.length - i - 1))) go(chars, i + 1) else false
      }

      go(string.toCharArray, 0)
    }

    @scala.annotation.tailrec
    def findFirstPal(iterator: Iterator[String]): Option[String] = {
      if (iterator.hasNext) {
        val s = iterator.next()
        if (isPalindrome(s)) Some(s)
        else findFirstPal(iterator)
      } else {
        None
      }
    }

    @scala.annotation.tailrec
    def generateSubs(string: String, length: Int): String = {
      val iterator = string.sliding(length)
      findFirstPal(iterator) match {
        case Some(x) => x
        case None => generateSubs(string, length - 1)
      }
    }
    generateSubs(s, s.length)
  }

  def longestPalindromeBruteForce(s: String): String = {
    def isPalindrome(string: String): Boolean = {
      @scala.annotation.tailrec
      def go(chars: Array[Char], i: Int): Boolean = {
        if (i == chars.length) true
        else if (chars(i).equals(chars(chars.length - i - 1))) go(chars, i + 1) else false
      }

      go(string.toCharArray, 0)
    }

    def generator(input: String, length: Int): Seq[Option[String]] = {
      val res: Seq[Option[String]] = for (i <- 0 until input.length if i + length <= input.length) yield {
        val x = input.substring(i, i + length)
        Some(x).filter(isPalindrome)
      }
      res
    }

    val x = (for (i <- s.length to 1 by -1)
      yield generator(s, i))
      .flatten.filter(_.isDefined).map(_.get).find(e => true).getOrElse("")
    x
  }
}

object LongestPalindromicSubstring extends App {

  //val sample: String = "aabad"
  val sample = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
  val i = new LongestPalindromicSubstring
  val now = System.nanoTime()
  val result = i.longestPalindromeBruteForce(sample)
  val tt = System.nanoTime() - now
  println(f"evaluated in ${tt / 1000} ms for ${result.length}")
  val nowSlider = System.nanoTime()
  val resultSlider = i.longestPalindromeUsingSlider(sample)
  val ttSlider = System.nanoTime() - now
  println(f"evaluated in ${ttSlider / 1000} ms ${resultSlider.length}")

}
