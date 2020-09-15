package edu.learnings.hackerrank

import edu.learnings.BaseFunSuite

class SpitStringSuite extends BaseFunSuite {

  test("hacker -> hce akr"){
    assertResult("hce akr")(StringSplit.splitString("hacker"))
  }

  test("rank -> rn ak"){
    assertResult("rn ak")(StringSplit.splitString("rank"))
  }

  test("empty string has no effect"){
    assertResult("")(StringSplit.splitString(""))
  }


}
