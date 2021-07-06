package xplore.learnings.hackerrank

import xplore.learnings.BaseFunSuite

class JumpingOnCloudSuite extends BaseFunSuite {

  test("0 returns 0") {
    assertResult(0)(JumpingOnClouds.jumpingOnClouds(Array(0)))
  }

  test("0 0 returns 1") {
    assertResult(1)(JumpingOnClouds.jumpingOnClouds(Array(0, 0)))
  }

  test("0 1 0 returns 1") {
    assertResult(1)(JumpingOnClouds.jumpingOnClouds(Array(0, 1, 0)))
  }

  test("0 0 0 returns 1") {
    assertResult(1)(JumpingOnClouds.jumpingOnClouds(Array(0, 0, 0)))
  }

  test("0 0 0 0 1 0 has min number of jump = 3") {
    assertResult(3)(JumpingOnClouds.jumpingOnClouds(Array(0, 0, 0, 0, 1, 0)))
  }

  test("0 0 1 0 0 1 0 has min number of jumps = 4 ") {
    assertResult(4)(JumpingOnClouds.jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 0)))
  }
}
