package edu.learnings;

//import org.scalatest.Assertions._
import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CubeCalculatorTest extends FunSuite {
  test("CubeCalculator.cube") {
    assert(CubeCalculator.cube(3) === 27)
  }

  test("CubeCalculator.fcube") {
    assert(CubeCalculator.fcube(3) == 27)
  }
}

