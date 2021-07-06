package xplore.learnings.leetcode.arrays

import xplore.learnings.BaseFlatSpec

class MergeSortedArraysSpec extends BaseFlatSpec{

  "two arrays of equal length " should "pass" in {
    val i = new MergeSortedArrays
    val x = Array(1,2,3,0,0,0)
    val y = Array(2,5,6)
    i.merge(x, 3, y, 3)
    x shouldBe Array(1,2,2,3,5,6)
  }

  "two empty arrays " should "pass" in {
    val i = new MergeSortedArrays
    val x = Array[Int]()
    val y = Array[Int]()
    i.merge(x, 0, y, 0)
    x.length shouldBe 0
  }

  "when first array is longer than the second " should "pass" in {
    val i = new MergeSortedArrays
    val x = Array(1,3,7,9,0,0,0)
    val y = Array(2,4,6)
    i.merge(x, 4, y, 3)
    x shouldBe Array(1,2,3,4,6,7,9)
  }

  "when second array is longer than the first " should "pass" in {
    val i = new MergeSortedArrays
    val x = Array(2,4,6,0,0,0,0)
    val y = Array(1,3,7,9)
    i.merge(x, 3, y, 4)
    x shouldBe Array(1,2,3,4,6,7,9)
  }

  "when second array is significanty longer than the first " should "pass" in {
    val i = new MergeSortedArrays
    val x = Array(100,0,0,0,0,0,0,0)
    val y = Array(1,3,7,11,17,19,23)
    i.merge(x, 1, y, 7)
    x shouldBe Array(1,3,7,11,17,19,23,100)
  }

}
