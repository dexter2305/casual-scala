package xplore.learnings.codewars

import xplore.learnings.BaseFunSpec


class SumOfSumOfMultiplesOf3Or5Spec extends BaseFunSpec {

  val instance = new SumOfMultiplesOf3Or5
  describe("Multiples of 3 or 5") {
    it("should handle basic cases") {
      assert(instance.sumOfMultiplesOf3Or5(10) === 23)
      assert(instance.sumOfMultiplesOf3Or5(20) === 78)
    }
  }
}
