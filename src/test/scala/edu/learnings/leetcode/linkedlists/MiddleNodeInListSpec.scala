package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFlatSpec

class MiddleNodeInListSpec extends BaseFlatSpec {

  "MiddleNodeInList" should "be 3 in 1-2-3-4-5" in {
    val h = ListNode(Array(1,2,3,4,5))
    MiddleNodeInList.middleNode(h) shouldBe h.next.next
  }

  it should "be 2 in 1-2-3" in {
    MiddleNodeInList.middleNode(ListNode(Array(1, 2, 3))).x shouldBe 2
  }

  it should "be 3 in 1-2-3-4" in {
    val h = ListNode(Array(1,2,3,4))
    MiddleNodeInList.middleNode(h) shouldBe h.next.next
  }

  it should "be 1 in [1]" in (MiddleNodeInList.middleNode(new ListNode(1)).x shouldBe 1)

  it should "be 2 in [1,2]" in (MiddleNodeInList.middleNode(ListNode(Array(1,2))).x shouldBe 2)



}
