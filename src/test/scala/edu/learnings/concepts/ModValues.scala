package edu.learnings.concepts

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ModValues extends FlatSpec with Matchers{

  "Mod value" should "5 % 4 = 1" in {
    5 % 4 shouldEqual  1
  }
  it should "4 % 4 == 0" in {
    4 % 4 shouldEqual 0
  }

  it should "(important) 3 % 4 == 3" in {
    3 % 4 shouldEqual 3
  }

}
