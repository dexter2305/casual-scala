package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFlatSpec

class RotateListSpec extends BaseFlatSpec {

  "rotateRight" should "handle empty array" in {
    RotateList.rotateRight(null, 100) shouldBe null
  }

  it should "should return same list when length is just 1" in {
    val actual = RotateList.rotateRight(new ListNode(23), 10)
    val expected = new ListNode(23)
    assertResult(ListNode.asString(expected))(ListNode.asString(actual))
  }

  it should "rotate right when k is less than length of list" in {
    val l = ListNode(Array(1,2,3,4))
    val actual = RotateList.rotateRight(l, 2)
    val expected = ListNode(Array(3,4,1,2))
    assertResult(ListNode.asString(expected))(ListNode.asString(actual))
  }

  it should "rotate right when k is greater than length of list" in {
    val l = ListNode(Array(1,2,3,4))
    val actual = RotateList.rotateRight(l, 6)
    val expected = ListNode(Array(3,4,1,2))
    assertResult(ListNode.asString(expected))(ListNode.asString(actual))
  }

  it should "return same array when k = 0" in {
    val actual = RotateList.rotateRight(new ListNode(23), 0)
    val expected = new ListNode(23)
    assertResult(ListNode.asString(expected))(ListNode.asString(actual))
  }
}
