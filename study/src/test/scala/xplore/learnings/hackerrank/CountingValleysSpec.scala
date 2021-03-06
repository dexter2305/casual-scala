package xplore.learnings.hackerrank

import xplore.learnings.BaseFlatSpec

class CountingValleysSpec extends BaseFlatSpec{

  "Valley count" should "be 1 in DDUU" in {
    assertResult(1)(CountingValleys.countingValleys(4, "DDUU"))
  }

  it should "be 0 in UUDD" in {
    assertResult(0)(CountingValleys.countingValleys(4, "UUDD"))
  }

  it should "be 1 in UDDDUDUU" in {
    assertResult(1)(CountingValleys.countingValleys(8, "UDDDUDUU"))
  }

  it should "be 0 in all uphill UUUU" in {
    assertResult(0)(CountingValleys.countingValleys(4,"UUUU"))
  }

  it should "be 0 in all download DDDD" in {
    assertResult(0)(CountingValleys.countingValleys(4, "DDDD"))
  }

  it should "be 0 in UDDDU" in {
    assertResult(0)(CountingValleys.countingValleys(5, "UDDDU"))
  }

  it should "be 1 in DDUDUU" in {
    assertResult(1)(CountingValleys.countingValleys(6, "DDUDUU"))
  }
}
