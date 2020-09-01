package edu.learnings.leetcode

import edu.learnings.BaseSuite

class MaxConsecutiveOnesSuite extends BaseSuite {

  private val t = new MaxConsecutiveOnes

  test("array of no 1 has no consecutive 1") {
    assertResult(0)(t.findMaxConsecutiveOnes(Array(0, 0, 0, 0)))
  }

  test("array of 1100 has 2 consecutive ones") {
    assertResult(2)(t.findMaxConsecutiveOnes(Array(1, 1, 0, 0)))
  }

  test("array of 100 has 1 consecutive ones") {
    assertResult(1)(t.findMaxConsecutiveOnes(Array(1, 0, 0)))
  }

  test("array of 11001111 has 4 consecutive ones") {
    assertResult(4)(t.findMaxConsecutiveOnes(Array(1, 1, 0, 0, 1, 1, 1, 1)))
  }

  test("array of 11110011 has 4 consecutive ones") {
    assertResult(4)(t.findMaxConsecutiveOnes(Array(1, 1, 1, 1, 0, 0, 1, 1)))
  }

  test("array of 1111001111 has 4 consecutive ones") {
    assertResult(4)(t.findMaxConsecutiveOnes(Array(1, 1, 1, 1, 0, 0, 1, 1, 1, 1)))
  }

}
