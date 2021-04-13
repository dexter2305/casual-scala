package edu.learnings.leetcode.linkedlists


class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object LinkedListCycle extends App {
  def hasCycle(head: ListNode): Boolean = {
    @scala.annotation.tailrec
    def go(slow: ListNode, fast: ListNode) : Boolean = {
      if (fast == null || fast.next == null) false
      else if (fast == slow) true
      else go(slow.next, fast.next.next)
    }
    if (head == null) false else go(head, head.next)
  }
}
