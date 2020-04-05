package edu.learnings.lc

import edu.learnings.lc.MaxSumSubArrayApp
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxSumSubArraySuite extends FunSuite {
  test("One element"){
    assert(MaxSumSubArrayApp.maxSubArray(Array(-1)) == -1)
  }
  test("All positives"){
    assert(MaxSumSubArrayApp.maxSubArray(Array(1,2,3,4,5)) == 15)
  }
  test("All negatives"){
    assert(MaxSumSubArrayApp.maxSubArray( Array(-5,-4,-3,-2,-1)) == -1)
  }
  test("mixed - complete array gives max sum") {
    assert(MaxSumSubArrayApp.maxSubArray(Array(-4,6,-3,5)) ==4)
  }
  test("mixed - partial array gives max sum") {
    assert(MaxSumSubArrayApp.maxSubArray(Array(-2,1,-3,4,-1,2,1-5,4)) == 6)
  }
}
