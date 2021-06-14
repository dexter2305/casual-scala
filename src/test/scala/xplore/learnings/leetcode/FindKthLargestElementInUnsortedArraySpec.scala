package xplore.learnings.leetcode

import xplore.learnings.BaseFlatSpec

class FindKthLargestElementInUnsortedArraySpec extends BaseFlatSpec {

  val i = new FindKthLargestElementInUnsortedArray

  "3rd largest in 1 2 3 4 5 6" should "be 4" in {
    i.findKthLargest(Array(1,2,3,4,5,6), 3) shouldBe 4
  }

  "2nd largest in 3,2,1,5,6,4" should "be 5" in {
    i.findKthLargest(Array(3,2,1,5,6,4), 2) shouldBe 5
  }

  "4th largest in 3,2,3,1,2,4,5,5,6" should "be 4" in {
    i.findKthLargest(Array(3,2,3,1,2,4,5,5,6), 4) shouldBe 4
  }

  "performance test: 10^7 largest in sequence from 1...10^7" should "0" in {

    val x:Array[Int] = (1 to math.pow(10, 7).toInt).toArray
    i.findKthLargest(x, math.pow(10,7).toInt) shouldBe 1
  }
}
