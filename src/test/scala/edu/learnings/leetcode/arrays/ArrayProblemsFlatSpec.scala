package edu.learnings.leetcode.arrays

import edu.learnings.BaseFlatSpec

class ArrayProblemsFlatSpec extends BaseFlatSpec {

  "plusOne" should "return [1,1,2] for [1,1,1] + 1" in {
    ArrayProblems.plusOne(Array(1,1,1)) shouldBe Array(1,1,2)
  }

  it should "return [1,0] for [9]" in {
    ArrayProblems.plusOne(Array(9)) shouldBe Array(1,0)
  }

  it should "return [9,1,0,0] for [9,0,9,9]" in {
    ArrayProblems.plusOne(Array(9,0,9,9)) shouldBe Array(9,1,0,0)
  }

}
