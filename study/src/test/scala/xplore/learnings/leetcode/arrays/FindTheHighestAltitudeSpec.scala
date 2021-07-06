package xplore.learnings.leetcode.arrays

import xplore.learnings.BaseFlatSpec

class FindTheHighestAltitudeSpec extends BaseFlatSpec {

  val i = new FindTheHighestAltitude

  "-5, 1, 5, 0, -7" should "be 1" in {
    i.largestAltitude(Array(-5, 1, 5, 0, -7)) shouldBe 1
  }

  "-4, -3, -2, -1, 4, 3, 2" should "be " in {
    i.largestAltitude(Array(-4, -3, -2, -1, 4, 3, 2)) shouldBe 0
  }
}
