package edu.learnings

import edu.learnings.lc.LastStoneWeight
class LastStoneWeightSuite extends BaseTest {

  test("Array (1) = 1")  {
    assert(LastStoneWeight.lastStoneWeight(Array(1)) == 1)
  }

  test("Array (100,100) = 0")  {
    assert(LastStoneWeight.lastStoneWeight(Array(100,100)) == 0)
  }

  test("Array (1,2,3) = 1")  {
    assert(LastStoneWeight.lastStoneWeight(Array(1)) == 1)
  }

  test("Array (100,10) = 90")  {
    assert(LastStoneWeight.lastStoneWeight(Array(100,10)) == 90)
  }

  test("Array (2,7,4,1,8,1) = 1")  {
    assert(LastStoneWeight.lastStoneWeight(Array(2,7,4,1,8,1)) == 1)
  }

}
