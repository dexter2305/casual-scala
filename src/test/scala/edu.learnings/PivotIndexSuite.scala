package edu.learnings

import edu.learnings.lc.PivotIndex

class PivotIndexSuite extends BaseSuite {

  test("empty array") {
    assert(PivotIndex.pivotIndex(Array()) == -1)
  }

  test("array with only one element = -1") {
    assert(PivotIndex.pivotIndex(Array(0)) == -1)
  }

  test("array with two elements = -1") {
    assert(PivotIndex.pivotIndex(Array(-1, 0)) == -1)
  }

  test("pi(1,2,3) = -1") {
    assert(PivotIndex.pivotIndex(Array(1, 2, 3)) == -1)
  }

  test("pi(1,7,3,6,5,6) = 3") {
    assert(PivotIndex.pivotIndex(Array(1, 7, 3, 6, 5, 6)) == 3)
  }

  /**
   * Valid testcase but the code is downgraded to handle leetcode tests.
   */
  test("pi(0,0, 0) = 1") {
    assert(PivotIndex.pivotIndex(Array(0,0, 0)) == 1)
  }

  /**
   * Valid testcase but the code is downgraded to handle leetcode tests.
   */
  test("pi 0,0,0,0 = 1") {
    assert(PivotIndex.pivotIndex(Array(0,0,0,0)) == 1)
  }

  test("with negative pi -1 0 -6 +5 = 1") {
    assert(PivotIndex.pivotIndex(Array(-1,0,-6,+5)) == 1)
  }

  test("pivots 1 2 3 2 1 5 = 2") {
    assert(PivotIndex.pivotIndex(Array(1,2,3,2,1,5)) == 3)
  }

  test("pivot [-1,-1,-1,0,1,1] = 0"){
    assert(PivotIndex.pivotIndex(Array(-1,-1,-1,0,1,1)) == 0)
  }
}
