package edu.learnings.hackerrank

import edu.learnings.BaseFlatSpec

class CircularArrayRotationSpec extends BaseFlatSpec {

  "CircularArrayRotation " should "pass basic test cases" in {
    val instance = new CircularArrayRotation
    instance.circularArrayRotation(Array(3, 4, 5), 2, Array(1, 2)) shouldEqual Array(5, 3)
  }
}
