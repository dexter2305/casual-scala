package xplore.learnings.leetcode.linkedlists

import xplore.learnings.BaseFlatSpec


class ListNodeSpec extends BaseFlatSpec {


  "sameElements" should "return true for list with identical values [1,2,3] [1,2,3]" in {
    ListNode.sameElements(ListNode(Array(1, 2, 3)), ListNode(Array(1, 2, 3))) shouldBe true
  }

  it should "return true for list with null" in {
    ListNode.sameElements(null, null) shouldBe true
  }

  it should "return false for list with different values [1,2,3] [2,2,2]" in {
    ListNode.sameElements(ListNode(Array(1, 2, 3)), ListNode(Array(2, 2, 2)))
  }

  it should "return false for list with different values towards end of list [1,2] [1,2,3,4]" in {
    ListNode.sameElements(ListNode(Array(1, 2)), ListNode(Array(1, 2, 3, 4))) shouldBe false
  }

  "asString" should "non-null string for a non empty List" in {
    ListNode(Array(1,2,3)).asString() shouldBe "1-2-3"
  }

  it should "return only the element when List has only one element" in {
    val x = new ListNode()
    ListNode(Array(1)).asString() shouldBe "1"
  }

}


