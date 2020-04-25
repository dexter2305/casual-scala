package edu.learnings

import edu.learnings.lc.PlusOne
class PlusOneSuite extends BaseSuite {

  test("1,2,3 is 1,2,4"){
    assertResult(Array(1,2,4))(PlusOne.plusOne_failsForLargeArray(Array(1,2,3)))
  }

  test("9 is 1,0"){
    assertResult(Array(1,0))(PlusOne.plusOne_failsForLargeArray(Array(9)))
  }

  test("9,0,9,9 is 9,1,0,0"){
    assertResult(Array(9,1,0,0))(PlusOne.plusOne_failsForLargeArray(Array(9,0,9,9)))
  }

  test ("1,9,9 is 2,0,0"){
    assertResult(Array(2,0,0))(PlusOne.plusOne_failsForLargeArray(Array(1,9,9)))
  }
}
