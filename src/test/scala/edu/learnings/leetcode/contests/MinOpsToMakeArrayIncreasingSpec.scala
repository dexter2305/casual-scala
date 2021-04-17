package edu.learnings.leetcode.contests

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MinOpsToMakeArrayIncreasingSpec extends BaseFunSpec {

  describe("Minimum Ops to make array increasing") {

    it("should return zero when array size is 1") {
      MinOpsToMakeArrayIncreasing.minOperations(Array(8)) shouldBe 0
    }

    it("should return 0 for an sorted array") {
      MinOpsToMakeArrayIncreasing.minOperations(Array(1, 2, 3, 4, 5)) shouldBe 0
    }

    it("should return 14 for 1,5,2,4,1") {
      MinOpsToMakeArrayIncreasing.minOperations(Array(1, 5, 2, 4, 1)) shouldBe 14
    }

    it("should return 3 for 1,1,1,") {
      MinOpsToMakeArrayIncreasing.minOperations(Array(1,1,1)) shouldBe 3
    }
  }
}
