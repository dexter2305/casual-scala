package xplore.learnings.leetcode.arrays

import xplore.learnings.BaseFunSpec

class ThirdMaxNumberSpec extends BaseFunSpec {

  describe("3rd Max Number") {
    it ("should return max when there are less than 3 distinct max numbers") {
      assertResult(2)(ThirdMaximumNumber.thirdMax(Array(1,2)))
      assertResult(2)(ThirdMaximumNumber.thirdMax(Array(1,1,2)))
      assertResult(1)(ThirdMaximumNumber.thirdMax(Array(1)))
      assertResult(1)(ThirdMaximumNumber.thirdMax(Array(1,1,1,1,1)))
    }

    it ("should return 3rd max when there are more than 3 distinct max numbers ") {
      assertResult(1)(ThirdMaximumNumber.thirdMax(Array(2,2,3,1)))

    }

    it ("should handle duplicates with 3rd max"){
      assertResult(1)(ThirdMaximumNumber.thirdMax(Array(2,2,3,3,3,3,1,1,1,1)))
    }
  }
}
