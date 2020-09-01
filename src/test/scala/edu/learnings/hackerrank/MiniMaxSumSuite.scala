package edu.learnings.hackerrank

import edu.learnings.BaseSuite

class MiniMaxSumSuite extends BaseSuite {

  test("1 2 3 4 5") {
    assertResult("10 14")(MiniMaxSum.getVal(Array(1, 2, 3, 4, 5)))
  }
  test("256741038 623958417 467905213 714532089 938071625 returns 2063136757 2744467344") {
    assertResult("2063136757 2744467344")(MiniMaxSum.getVal(Array(256741038, 623958417, 467905213, 714532089, 938071625)))
  }
}
