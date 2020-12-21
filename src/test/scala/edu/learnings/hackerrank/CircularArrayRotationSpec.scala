package edu.learnings.hackerrank

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CircularArrayRotationSpec extends FlatSpec with Matchers{

  "CircularArrayRotation " should "pass basic test cases" in {
    val instance = new CircularArrayRotation
    instance.circularArrayRotation(Array(3,4,5), 2, Array(1,2)) shouldEqual Array(5,3)
  }
}
