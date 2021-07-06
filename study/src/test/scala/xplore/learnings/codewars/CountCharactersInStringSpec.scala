package xplore.learnings.codewars

import xplore.learnings.BaseFlatSpec

class CountCharactersInStringSpec extends BaseFlatSpec {
  val i = new CountCharactersInString
  it should "work with example tests" in {
    assert(i.count("aba") == Map[Char, Int]('a' -> 2, 'b' -> 1))
    assert(i.count("") == Map[Char, Int]())
  }
}
