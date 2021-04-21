package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFlatSpec

class MergeTwoSortedListsSpec extends BaseFlatSpec {


  "MergeTwoSortedList" should "return [1,1,2,3,4,4] for [1,3,4] &&  [1,2,4]" in {
    val r = MergeTwoSortedLists.mergeTwoLists(ListNode(Array(1, 3, 4)), ListNode(Array(1, 2, 4)))
    val ex = ListNode(Array(1, 1, 2, 3, 4, 4))
    assert(ListNode.sameElements(ex, r), s"expected: ${ListNode.asString(r)}, actual: ${ListNode.asString(r)}")
  }

  it should "return 1-> 2-> 3 for null, 1->2->3" in {
    val r = MergeTwoSortedLists.mergeTwoLists(null, ListNode(Array(1, 2, 3)))
    assert(ListNode.sameElements(ListNode(Array(1, 2, 3)), r), s"expected: ${ListNode.asString(ListNode(Array(1, 2, 3)))}, actual: ${ListNode.asString(r)}")
  }

  it should "return 1-> 2-> 3 for  1->2->3 and null" in {
    val r = MergeTwoSortedLists.mergeTwoLists(ListNode(Array(1, 2, 3)), null)
    assert(ListNode.sameElements(ListNode(Array(1, 2, 3)), r), s"expected: ${ListNode.asString(ListNode(Array(1, 2, 3)))}, actual: ${ListNode.asString(r)}")
  }

  it should "return null when both lists are null" in {
    MergeTwoSortedLists.mergeTwoLists(null, null) shouldBe null
  }

}
