package edu.learnings;

//import org.scalatest.Assertions._
import org.scalatest.FunSuite

class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 7)
  }

  test("CubeCalculator.fcube") {
    assert(CubeCalculator.fcube(3) == 27)
  }
}

