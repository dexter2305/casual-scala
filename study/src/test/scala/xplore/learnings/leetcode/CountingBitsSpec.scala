package xplore.learnings.leetcode

import xplore.learnings.BaseFlatSpec

class CountingBitsSpec extends BaseFlatSpec {

  val i = new CountingBits
  "for n = 5" should "be 0,1,1,2,1,2" in {
    i.countBits(5) shouldBe Array(0, 1, 1, 2, 1, 2)
  }

  "for n = 2" should "be 0,1,1" in {
    i.countBits(2) shouldBe Array(0, 1, 1)
  }

  "for n = 1" should "be 0,1" in {
    i.countBits(1) shouldBe Array(0,1)
  }

  "for n = 0" should "be 0" in {
    i.countBits(0) shouldBe Array(0)
  }


  s"Performance test" should s" complete in ${timeLimit.toMillis} ms" in {
    i.countBits(math.pow(10,5).toInt)
  }
}
