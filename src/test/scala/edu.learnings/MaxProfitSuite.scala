package edu.learnings

import edu.learnings.lc.MaxProfit

class MaxProfitSuite extends BaseSuite {

  test("Price decreases every day") {
    assert(MaxProfit.maxProfit(Array(4, 3, 2, 1)) == 0)
  }
  test("Price increases by 1 everyday (1 2 3 4 5) profits 4 ") {
    assert(MaxProfit.maxProfit(Array(1, 2, 3, 4, 5)) == 4)
  }
  test("Price spikes 7 1 5 3 6 4 should give 7"){
    assert(MaxProfit.maxProfit(Array(7,1,5,3,6,2)) == 7)
  }
  test("Price remains constant"){
    assert(MaxProfit.maxProfit(Array(2,2,2,2,2,2)) == 0)
  }
}
