package xplore.contest.freshworks

import xplore.learnings.BaseFlatSpec


class FrequencyInRangeSpec extends BaseFlatSpec {

  "FrequencyInRange" should "pass tests with absolute range where limit == input.length" in {
    val findFrequencyInRange = new FindFrequencyInRange
    findFrequencyInRange.frequencyInRange("aabaabaab", 'b', 9, 3) shouldEqual 3
    findFrequencyInRange.frequencyInRange("aabaabaab", 'a', 9, 3) shouldEqual 6
  }

  it should "pass with limit < input.length" in {
    val findFrequencyInRange = new FindFrequencyInRange
    findFrequencyInRange.frequencyInRange("aabaabaab", 'b', 8, 3) shouldEqual 2
    findFrequencyInRange.frequencyInRange("aabaabaab", 'a', 8, 3) shouldEqual 6
    findFrequencyInRange.frequencyInRange("aabaabaab", 'a', 7, 3) shouldEqual 5
  }

  it should "pass when q is not present in input at all" in {
    val findFrequencyInRange = new FindFrequencyInRange
    findFrequencyInRange.frequencyInRange("aabaabaab", 'z', 8, 3) shouldEqual 0

  }

}
