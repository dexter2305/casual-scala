package edu.learnings.leetcode.arrays

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ArrayProblemsSpec extends BaseFunSpec {

  describe("ArrayProblems") {
    describe("createTargetArray") {
      it("return [[0,4,1,3,2]] for nums = [0,1,2,3,4], index = [0,1,2,2,1]") {
        ArrayProblems.createTargetArray(Array(0, 1, 2, 3, 4), Array(3, 1, 2, 2, 1)) shouldBe Array(0, 4, 1, 3, 2)
      }
    }

    describe("pivotIndex") {
      it("should return -1 when no pivot exists") {
        ArrayProblems.pivotIndex(Array(1, 2, 3)) shouldBe -1
      }

      it("should return pivot element when lsum == rsum") {
        ArrayProblems.pivotIndex(Array(2, 1, -1)) shouldBe 0
      }

      it("should return 0 when length of array == 1")(ArrayProblems.pivotIndex(Array(1)) shouldBe 0)

      it("should return 0 for [0,0,0]")(ArrayProblems.pivotIndex(Array(0, 0, 0)) shouldBe 0)
    }

    describe("dominantIndex") {
      it("should return -1 when array length == 1")(ArrayProblems.dominantIndex(Array(1)) shouldBe 0)
      it("should return -1 when no dominant index exists") (ArrayProblems.dominantIndex(Array(1,2,3,4)) shouldBe -1)
      it("should return position of dominant index when only one exists")(ArrayProblems.dominantIndex(Array(1,2,3,8)) shouldBe 3)
      it("should return position of first dominant index when multiple exist")(ArrayProblems.dominantIndex(Array(1,8,2,3,8)) shouldBe 1)
      it("should return position of dominant index even second max element is 2 * maxval")(ArrayProblems.dominantIndex(Array(4,8)) shouldBe 1)
    }
  }
}
