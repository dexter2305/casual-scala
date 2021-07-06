package xplore.learnings.interviewbit

import xplore.learnings.BaseFunSuite

class NobleIntegerSuite extends BaseFunSuite {

  test("1,2,3,4 returns 1"){
    assertResult(1)(NobleInteger.solve(Array(1,2,3,4)))
  }

  test("1,2,1,4 returns -1"){
    assertResult(-1)(NobleInteger.solve(Array(1,2,1,4)))
  }

  test("empty array returns -1"){
    assertResult(-1)(NobleInteger.solve(Array[Int]()))
  }

  test("array with equal numbers 1,1,1,1 returns -1"){
    assertResult(-1)(NobleInteger.solve(Array(1,1,1,1,1)))
  }

  test("5,6,2 returns 1"){
    assertResult(1)(NobleInteger.solve(Array(5,6,2)))
  }

}
