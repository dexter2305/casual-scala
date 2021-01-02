package edu.learnings.leetcode

import edu.learnings.BaseFlatSpec

class MaximumWealthSpec extends BaseFlatSpec {

  "Max Wealth spec" should " be 6 in [[1,2,3],[3,2,1]] " in {
    val maximumWealth = new MaximumWealth
    maximumWealth.maximumWealth(Array(Array(1, 2, 3), Array(3, 2, 1))) should be(6)
  }

  it should " be 17 in [[2,8,7],[7,1,3],[1,9,5]] " in {
    val maximumWealth = new MaximumWealth
    maximumWealth.maximumWealth(Array(Array(2, 8, 7), Array(7, 1, 3), Array(1, 9, 5))) should be(17)
  }
}
