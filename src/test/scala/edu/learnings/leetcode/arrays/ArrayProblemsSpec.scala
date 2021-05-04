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
      it("should return -1 when no dominant index exists") (ArrayProblems.dominantIndex(Array(1,2,3,4)) shouldBe -1)
      it("should return position of dominant index when only one exists")(ArrayProblems.dominantIndex(Array(1,2,3,8)) shouldBe 3)
      it("should return position of first dominant index when multiple exist")(ArrayProblems.dominantIndex(Array(1,8,2,3,8)) shouldBe 1)
      it("should return position of dominant index even second max element is 2 * maxval")(ArrayProblems.dominantIndex(Array(4,8)) shouldBe 1)
    }

    describe("runningSum"){
      it ("should return 10 for [10]") (ArrayProblems.runningSum(Array(10)) shouldBe Array(10))
      it ("should return [1,2,3,4,5] for [1,1,1,1,1]")(ArrayProblems.runningSum(Array(1,1,1,1,1)) shouldBe Array(1,2,3,4,5))
      it ("should return [1,3,6,10] for [1,2,3,4]")(ArrayProblems.runningSum(Array(1,2,3,4)) shouldBe Array(1,3,6,10))
      it ("should boundary conditions. -10^6 < nums(i) < 10^6 and 1 <= nums.length <= 1000 ") {
        val input = for ( _ <- 0 until 1000) yield Random.between(math.pow(10, -6).toInt, math.pow(10, 6).toInt)
        println(s"some input elements are ${input.take(5).mkString( " | ")}")
        ArrayProblems.runningSum(input.toArray)
      }
    }
  }
}
