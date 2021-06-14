package xplore.learnings.leetcode.arrays

import xplore.learnings.BaseFlatSpec

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

  "findDiagonalOrder" should "return [1,2,4,7,5,3,6,8,9] from [[1,2,3],[4,5,6],[7,8,9]]" in {
    ArrayProblems.findDiagonalOrder(Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))) shouldBe Array(1,2,4,7,5,3,6,8,9)
  }

  it should "return [1,2,3,4] from [[1,2][3,4]]" in {
    ArrayProblems.findDiagonalOrder(Array(Array(1,2), Array(3,4))) shouldBe Array(1,2,3,4)
  }

}
