package edu.learnings.interviewbit

import edu.learnings.BaseSuite

class LargestNumberSuite extends BaseSuite{

  test("naturally correct order: 9,34 should return 934"){
    assertResult("934")(LargestNumber.largestNumber(Array(9,34)))
  }

  test("jumbled order: 34,9,33 should return 93433"){
    assertResult("93433")(LargestNumber.largestNumber(Array(34,9,33)))
  }

  test("empty array returns empty string"){
    assertResult("")(LargestNumber.largestNumber(Array[Int]()))
  }

  test("with 0s : 0,0,20,29,8,7 should return 87292000"){
    assertResult("87292000")(LargestNumber.largestNumber(Array(0,0,20,29,8,7)))
  }

  test("array with only 0s should return 0"){
    assertResult("0")(LargestNumber.largestNumber(Array(0,0,0,0,0)))
  }
}
