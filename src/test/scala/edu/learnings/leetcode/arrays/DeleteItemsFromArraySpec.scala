package edu.learnings.leetcode.arrays

import edu.learnings.BaseFlatSpec

class DeleteItemsFromArraySpec extends BaseFlatSpec{

  "Array with single element matching element to be removed" should " return length as 0" in {
    DeleteItemsFromArray.removeElement(Array(1), 1) shouldEqual  0
  }

  "Array with single element Not matching element to be removed" should "return length as 1" in {
    DeleteItemsFromArray.removeElement(Array(1), 100) shouldEqual  1
  }

  "Empty array with any element to be removed" should "return 0 as length" in {
    DeleteItemsFromArray.removeElement(Array.empty[Int], 100)
  }

  "Array with no element matching the removable element" should "return length of array" in {
    DeleteItemsFromArray.removeElement(Array(2,3,4,5,6,7), 1) shouldEqual  6
  }

  "Array(3,2,2,3) with 2 to be removed" should "return 2" in {
    val l = Array(3,2,2,3)
    DeleteItemsFromArray.removeElement(l, 2) shouldEqual  2
    l.take(2) shouldEqual Array(3,3)
  }

  "Array(1,1,1,1,1,1) with every element to be removed" should "return 0" in {
    DeleteItemsFromArray.removeElement(Array(1,1,1,1,1,1,1), 1) shouldBe 0
  }

  "Array(1,1,1,1,6) with only last element to be removed" should "return 1" in {
    val l = Array(1,1,1,1, 6)
    DeleteItemsFromArray.removeElement(l, 1) shouldBe 1
    l.take(1) shouldBe Array(6)
  }
}
