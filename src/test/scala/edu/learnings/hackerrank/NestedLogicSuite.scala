package edu.learnings.hackerrank

import edu.learnings.BaseFunSuite
import edu.learnings.hackerrank.NestedLogic.Date

class NestedLogicSuite extends BaseFunSuite {

  test("early return has no penalty. 23/12/1234 returned against 19/9/2468.") {
    assertResult(0) {
      NestedLogic.evalPenalty(Date(Array(23, 12, 1234)), Date(Array(19, 9, 2468)))
    }
  }

  test("late by one day, fine=15. 23/12/1234 returned against 24/12/1234.") {
    assertResult(15) {
      NestedLogic.evalPenalty(Date(Array(25, 12, 1234)), Date(Array(24, 12, 1234)))
    }
  }

  test("late by a year, fine=10000. 23/12/1234 returned against 24/12/1233.") {
    assertResult(10000) {
      NestedLogic.evalPenalty(Date(Array(23, 11, 1234)), Date(Array(23, 11, 1233)))
    }
  }

  test("late by a month, fine=500. 23/11/1234 returned against 24/12/1234.") {
    assertResult(500) {
      NestedLogic.evalPenalty(Date(Array(23, 12, 1234)), Date(Array(31, 11, 1234)))
    }
  }


}
