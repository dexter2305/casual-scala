package xplore.learnings.leetcode.arrays

import xplore.learnings.BaseFlatSpec
import org.scalatest.BeforeAndAfter

class SubRectangleQueriesSpec extends BaseFlatSpec with BeforeAndAfter {

  val input: Array[Array[Int]] = Array(Array(1, 2, 1), Array(4, 3, 4), Array(3, 2, 1), Array(1, 1, 1))
  var i: SubRectangleQueries = _

  before {
    i = new SubRectangleQueries(input)
  }

  s"SubRectangleQueries: only get " should "be 1 for (0,0)" in {
    i.getValue(0, 0) shouldBe 1
  }

  it should "be 1 for (3,2)" in {
    i.getValue(3, 2) shouldBe 1
  }

  "SubRectangleQueries changed with new value as 5 from (0,0) to (1,2)" should "be 5 for (0,0)" in {
    i.updateSubrectangle(0, 0, 1, 2, 5)
    i.getValue(0, 0) shouldBe 5
  }

  it should "be 5 for (1,2)" in {
    i.updateSubrectangle(0, 0, 1, 2, 5)
    i.getValue(1, 2) shouldBe 5
  }

  "SubRectangle unchanged for new value as 5 and (0,0) to (1,2)" should "be 1 for (3,2)" in {
    i.updateSubrectangle(0, 0, 1, 2, 5)
    i.getValue(3, 2) shouldBe 1
  }

  it should "be 3 (unchanged) for (2,0)" in {
    i.updateSubrectangle(0, 0, 1, 2, 5)
    i.getValue(2, 0) shouldBe 3
  }


}
