package edu.learnings.leetcode

import edu.learnings.BaseSuite
import edu.learnings.random.CubeCalculator

class CubeCalculatorTest extends BaseSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.fcube") {
    assert(CubeCalculator.fcube(3) == 27)
  }
}
