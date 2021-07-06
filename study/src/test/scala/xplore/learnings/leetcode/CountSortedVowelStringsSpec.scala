package xplore.learnings.leetcode

import xplore.learnings.BaseFlatSpec

class CountSortedVowelStringsSpec extends BaseFlatSpec{
  val i = new CountSortedVowelStrings

  "for n = 1" should "ans : 5" in {
    i.countVowelStrings(1) shouldBe 5
  }

  "for n = 33" should "ans : 66045" in {
    i.countVowelStrings(33) shouldBe 66045
  }

}
