package edu.learnings.leetcode.linkedlists

object IntersectionOfTwoLinkedLists {
  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {

    var x = headA
    var y = headB

    while(x != y){
      x = if (x == null) headB else x.next
      y = if (y == null) headA else y.next
    }
    x
  }
}
