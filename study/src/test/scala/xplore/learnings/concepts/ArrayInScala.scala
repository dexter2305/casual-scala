package xplore.learnings.concepts

import xplore.learnings.BaseFlatSpec

class ArrayInScala extends BaseFlatSpec {
  "Array" should "can be modified in place in scala" in {
    val array = Array(1, 2, 3)
    array(0) = 100
    array(0) shouldEqual 100
  }

  it should "have same memory address even contents are modified" in {
    val array: Array[Int] = Array(1, 2, 3)
    val referringArray = array
    array(0) = 100
    array eq referringArray should be(true)
  }
}
