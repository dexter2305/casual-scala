package xplore.learnings.leetcode.arrays

import xplore.learnings.BaseFunSpec


class SortArrayByParitySpec extends BaseFunSpec {

  describe("SortArrayByParity") {
    it("should return same for empty array ") {
      assertResult(Array.empty[Int])(SortArrayByParity.sortArrayByParity(Array.empty[Int]))
    }
    it("should return evens before odds in") {
      val l = Array(3, 5, 2, 4)
      val ans = SortArrayByParity.sortArrayByParity(l)
      ans.take(2).foreach(e => assert(e % 2 == 0, s"Expected $e to be even"))
    }
    it("returns the same array when no even is present") {
      val l = Array(1, 3, 5)
      assertResult(Array(1, 3, 5))(SortArrayByParity.sortArrayByParity(l))
    }
  }


}
