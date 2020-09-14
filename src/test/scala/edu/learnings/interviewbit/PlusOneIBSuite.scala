package edu.learnings.interviewbit

import edu.learnings.BaseSuite

class PlusOneIBSuite extends BaseSuite {

  test("empty array should return empty array"){
    assertResult(Array[Int]())(PlusOne.plusOne(Array[Int]()))
  }

  test("1,2,4 should return 1,2,5"){
    assertResult(Array(1,2,5))(PlusOne.plusOne(Array(1,2,4)))
  }

  test("ignore leading zero: 0,2,3,4 should return 2,3,5"){
    assertResult(Array(2,3,5))(PlusOne.plusOne(Array(0,2,3,4)))
  }

  test("honor carry forwards: 9 should return 1,0"){
    assertResult(Array(1,0))(PlusOne.plusOne(Array(9)))
  }

  test("only with 0s: 0,0,0,0 should return 1"){
    assertResult(Array(1))(PlusOne.plusOne(Array(0,0,0,0)))
  }
}
