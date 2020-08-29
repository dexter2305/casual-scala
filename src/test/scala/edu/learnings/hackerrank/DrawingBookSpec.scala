package edu.learnings.hackerrank

import edu.learnings.BaseSpec

class DrawingBookSpec extends BaseSpec {

  "Pages to be turned " should "be 0 when n=100 & p=1" in {
    assertResult(0)(DrawingBook.pageCount(100, 1))
  }

  it should "be 2 when n = 11 & p = 4" in {
    assertResult(2)(DrawingBook.pageCount(11, 4))
  }

  it should "be 0 when n = 11 and p = 11" in {
    assertResult(0)(DrawingBook.pageCount(11,11))
  }
}
