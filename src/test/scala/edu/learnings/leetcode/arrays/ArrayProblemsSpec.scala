package edu.learnings.leetcode.arrays

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import scala.util.Random

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
      it("should return -1 when no dominant index exists")(ArrayProblems.dominantIndex(Array(1, 2, 3, 4)) shouldBe -1)
      it("should return position of dominant index when only one exists")(ArrayProblems.dominantIndex(Array(1, 2, 3, 8)) shouldBe 3)
      it("should return position of first dominant index when multiple exist")(ArrayProblems.dominantIndex(Array(1, 8, 2, 3, 8)) shouldBe 1)
      it("should return position of dominant index even second max element is 2 * maxval")(ArrayProblems.dominantIndex(Array(4, 8)) shouldBe 1)
    }

    describe("runningSum") {
      it("should return 10 for [10]")(ArrayProblems.runningSum(Array(10)) shouldBe Array(10))
      it("should return [1,2,3,4,5] for [1,1,1,1,1]")(ArrayProblems.runningSum(Array(1, 1, 1, 1, 1)) shouldBe Array(1, 2, 3, 4, 5))
      it("should return [1,3,6,10] for [1,2,3,4]")(ArrayProblems.runningSum(Array(1, 2, 3, 4)) shouldBe Array(1, 3, 6, 10))
      it("should boundary conditions. -10^6 < nums(i) < 10^6 and 1 <= nums.length <= 1000 ") {
        val input = for (_ <- 0 until 1000) yield Random.between(math.pow(10, -6).toInt, math.pow(10, 6).toInt)
        println(s"some input elements are ${input.take(5).mkString(" | ")}")
        ArrayProblems.runningSum(input.toArray)
      }
    }

    describe("checkPossibility - to get non-decreasing array by at most one element change") {
      it("should return true for [4,2,3]  - replace only one element '4'")(ArrayProblems.checkPossibility(Array(4, 2, 3)) shouldBe true)
      it("should return false for [4,2,1] - needs two elements to change position")(ArrayProblems.checkPossibility(Array(4, 2, 1)) shouldBe false)
      it("should return true for [1,2,3] - needs no change")(ArrayProblems.checkPossibility(Array(1, 2, 3)) shouldBe true)
      it("should return true for [1]")(ArrayProblems.checkPossibility(Array(100)) shouldBe true)
      it("should return false for identical elements [2,2,2,2]")(ArrayProblems.checkPossibility(Array(2, 2, 2, 2)) shouldBe true)
      it("should return false for grouped misfits [3,4,2,3]")(ArrayProblems.checkPossibility(Array(3, 4, 2, 3)) shouldBe false)

      it("should run to completion in ${timeLimit.toSeconds} for -10^5 <= nums(i) <= 10^5 and 1 <= nums.length <= 10^4") {
        val input = (for (_ <- 0 to math.pow(10, 4).toInt) yield Random.between(math.pow(10, 5) * -1, math.pow(10, 5)).toInt).toArray
        println(s"First 5 values of ${input.length} are ${input.take(5).mkString(" , ")}")
        ArrayProblems.checkPossibility(input)
      }
    }
  }
}
