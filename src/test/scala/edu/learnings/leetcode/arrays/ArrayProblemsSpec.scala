package edu.learnings.leetcode.arrays

import edu.learnings.BaseFlatSpec

object ArrayProblemsSpec extends BaseFlatSpec {

  "createTargetArray" should "return [[0,4,1,3,2]] for nums = [0,1,2,3,4], index = [0,1,2,2,1]" in {
    ArrayProblems.createTargetArray(Array(0, 1, 2, 3, 4), Array(3, 1, 2, 2, 1)) shouldBe Array(0, 4, 1, 3, 2)
  }
}
