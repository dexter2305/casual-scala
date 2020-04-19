package edu.learnings

import edu.learnings.lc.DominantIndex

class DominantIndexSuite extends BaseSuite {

  test("dominant index in 3, 6, 1, 0 is 1") {
    assert(DominantIndex.dominantIndex(Array(3, 6, 1, 0)) == 1)
  }

  test("dominant index in 1,2,3,4 is 1") {
    assert(DominantIndex.dominantIndex(Array(1, 2, 3, 4)) == -1)
  }

  test("empty array is -1"){
    assertResult(-1)((DominantIndex.dominantIndex(Array())))
  }

  test("all duplicates is -1"){
    assertResult(0)(DominantIndex.dominantIndex(Array(1,1,1,1)))
  }

  test("should return first largest with duplicate largest. 3,6,1,0,6 should return 1"){
    assertResult(1)(DominantIndex.dominantIndex(Array(3,6,1,0,6)))
  }

  test("dominant among negatives. -1,-4,-4 is 0"){
    assertResult(0)(DominantIndex.dominantIndex(Array(-1,-4,-4)))
  }

  test("array with single element"){
    assertResult(0)(DominantIndex.dominantIndex(Array(1)))
  }
}
