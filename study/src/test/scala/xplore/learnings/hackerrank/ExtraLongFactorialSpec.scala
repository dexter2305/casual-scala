package xplore.learnings.hackerrank

import xplore.learnings.BaseFlatSpec

class ExtraLongFactorialSpec extends BaseFlatSpec {

  s"Performance test with n = 100" should s"pass ${timeLimit.toSeconds} seconds" in {
    val i = new ExtraLongFactorial
    i.extraLongFactorials(100)
  }

}
