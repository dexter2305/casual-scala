package xplore.learnings.hackerrank

import xplore.learnings.BaseFunSuite

class BeautifulDaysSuite extends BaseFunSuite {

  test("beautiful days in (20 23 6) are 2 ") {
    assertResult(2)(BeautifulDays.beautifulDays(20, 23, 6))
  }

  test("beautiful days in (20 23 0) are 0 ") {
    assertResult(0)(BeautifulDays.beautifulDays(20, 23, 0))
  }

}
