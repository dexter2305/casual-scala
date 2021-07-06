package xplore.learnings.leetcode.linkedlists

import xplore.learnings.BaseFlatSpec

class AddTwoNumbersSpec extends BaseFlatSpec {

  "AddTwoNumbers" should "return [7,0,8] from [2,4,3][5,6,4]" in {
    val a = AddTwoNumbers.addTwoNumbers(ListNode(Array(2, 4, 3)), ListNode(Array(5, 6, 4)))
    assert(ListNode.sameElements(ListNode(Array(7, 0, 8)), a), s"${ListNode.asString(a)}")
  }

  ignore should "return [2,4,6,4] from [4,3,2,1][3,2,1]" in {
    val a = AddTwoNumbers.addTwoNumbers(ListNode(Array(4, 3, 2, 1)), ListNode(Array(3, 2, 1)))
    assert(ListNode.sameElements(ListNode(Array(2, 4, 6, 4)), a), s"${ListNode.asString(a)}")
  }

  it should "return [7,0,4,0,1]  for [2,4,9][5,6,4,9]" in {
    val a = AddTwoNumbers.addTwoNumbers(ListNode(Array(2,4,9)), ListNode(Array(5,6,4,9)))
    assert(ListNode.sameElements(ListNode(Array(7,0,4,0,1)), a), s"${ListNode.asString(a)}")
  }

}
