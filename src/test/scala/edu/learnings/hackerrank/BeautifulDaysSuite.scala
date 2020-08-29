package edu.learnings.hackerrank

import edu.learnings.BaseSuite

class BeautifulDaysSuite extends BaseSuite {

  test("beautiful days in (20 23 6) are 2 ") {
    assertResult(2)(BeautifulDays.beautifulDays(20, 23, 6))
  }

  test("beautiful days in (20 23 0) are 0 ") {
    assertResult(0)(BeautifulDays.beautifulDays(20, 23, 0))
  }

}
