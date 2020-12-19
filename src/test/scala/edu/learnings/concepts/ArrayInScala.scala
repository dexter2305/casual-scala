package edu.learnings.concepts

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ArrayInScala extends FlatSpec with Matchers with BeforeAndAfter{
  "Array" should "can be modified in place in scala" in {
    val array = Array(1,2,3)
    array(0) = 100
    array(0) shouldEqual 100
  }

  it should "have same memory address even contents are modified" in {
    val array: Array[Int] = Array(1,2,3)
    val referringArray = array
    array(0) = 100
    array eq referringArray should be (true)
  }
}
