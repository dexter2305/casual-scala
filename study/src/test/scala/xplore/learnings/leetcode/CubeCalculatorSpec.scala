package xplore.learnings.leetcode

import xplore.learnings.BaseFlatSpec
import xplore.learnings.random.CubeCalculator


class CubeCalculatorSpec extends BaseFlatSpec {

  "Cube of 3" should "return 27" in {
    assert(27 == CubeCalculator.fcube(3))
  }

  "Cube of 0" should "return 0" in {
    assert(CubeCalculator.fcube(0) == 0)
  }
}
