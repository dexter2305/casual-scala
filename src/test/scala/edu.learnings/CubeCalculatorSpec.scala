package edu.learnings

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CubeCalculatorSpec extends FlatSpec{

  "Cube of 3" should "return 27" in {
    assert(27 == CubeCalculator.fcube(3))
  }
}
