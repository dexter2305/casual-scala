package xplore.learnings.leetcode

import xplore.learnings.BaseFunSuite
import xplore.learnings.random.CubeCalculator

class CubeCalculatorTest extends BaseFunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.fcube") {
    assert(CubeCalculator.fcube(3) == 27)
  }
}
