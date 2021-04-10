package edu.learnings.leetcode.arrays

import edu.learnings.{BaseFlatSpec, BaseFunSpec}

class RemoveElementSpec extends BaseFlatSpec {

  "Non existing value in array" should "return the same array" in {
    RemoveElement.removeElement(Array(1,2,3), 100) shouldBe 3
  }

  "Array(3,2,2,3) to remove 3" should " length 2 " in {
    val l = Array(3,2,2,3)
    RemoveElement.removeElement(l, 3) shouldBe 2
  }

  "0,1,2,2,3,0,4,2 to remove 2" should " return length 5 " in {
    val a = Array(0,1,2,2,3,0,4,2)
    RemoveElement.removeElement(a, 2) shouldBe 5
  }

  "Empty array " should "return 0" in {
    RemoveElement.removeElement(Array.empty[Int], 100) shouldBe 0
  }

  "Array with all elements to be removed" should "return length 0" in {
    RemoveElement.removeElement(Array(1,1,1,1,1,1), 1) shouldBe 0
  }
}
