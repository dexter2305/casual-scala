package edu.learnings.scalatest

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner



@RunWith(classOf[JUnitRunner])
class MyFlatSpec extends FlatSpec {

  "An empty list" should " be of size == 0" in {
    assertResult(0)(List.empty.size)
  }

  it should " not have any element" in {
    assertResult(true)(true)
  }

}

@RunWith(classOf[JUnitRunner])
class MyFlatSpecWithMatchers extends FlatSpec with Matchers {

  "An empty set" should " have 0 elements in it" in {
    Set.empty.size should equal (0)
  }

  it should "should not no elements" in {
    Set.empty.size shouldEqual 0
  }
}
