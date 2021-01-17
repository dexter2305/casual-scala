package edu.learnings.leetcode

import edu.learnings.BaseFlatSpec

class ShuffleTheArraySpec extends BaseFlatSpec {

  val i = new ShuffleTheArray
  "1,2,3,4,5,6 with n = 3" should "be 1,4,2,5,3,6" in {
    i.shuffle(Array(1, 2, 3, 4, 5, 6), 3) shouldBe Array(1, 4, 2, 5, 3, 6)
  }

  "Performance test" should "pass" in {
    val input = (0 until 500).toArray
    i.shuffle(input, 250).length shouldBe 500
  }

}
