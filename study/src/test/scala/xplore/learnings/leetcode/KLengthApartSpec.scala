package xplore.learnings.leetcode

import xplore.learnings.BaseFlatSpec

class KLengthApartSpec extends BaseFlatSpec {

  private val i = new KLengthApart
  "KLengthApart" should " be true for '1,1,1,1,1' with k = 0 " in {
    i.kLengthApart(Array(1, 1, 1, 1, 1), 0) should be(true)
  }

  it should "be false for '1,0,0,1,0,1' with k = 2" in {
    i.kLengthApart(Array(1, 0, 0, 1, 0, 1), 2) should be(false)
  }

  it should "be true for '0,1,0,1' with k = 1" in {
    i.kLengthApart(Array(0, 1, 0, 1), 1) should be(true)
  }

  it should "be true for [1] irrespective of k" in {
    i.kLengthApart(Array(1), 1) should be(true)
    i.kLengthApart(Array(1), 0) should be(true)
  }



  "Performance" should s"(lengthy early detect) complete with valid results in ${timeLimit.toMillis}ms" in {
    val input: Array[Int] = Array.fill(math.pow(10, 5).toInt)(1)
    i.kLengthApart(input, 5) should be(false)
  }

  it should s"(late detect) complete with valid results" in {
    val input = Array.fill(math.pow(10,5).toInt)(0)
    input(input.length -1) = 1
    input(input.length -2) = 1
    i.kLengthApart(input, 5) should be(false)
  }


}
