package edu.learnings.scalatest

import edu.learnings.BaseFlatSpec

class MyFlatSpec extends BaseFlatSpec {

  "An empty list" should " be of size == 0" in {
    assertResult(0)(List.empty.size)
  }

  it should " not have any element" in {
    assertResult(true)(true)
  }

}

class MyFlatSpecWithMatchers extends BaseFlatSpec {

  "An empty set" should " have 0 elements in it" in {
    Set.empty.size should equal(0)
  }

  it should "should not no elements" in {
    Set.empty.size shouldEqual 0
  }
}
