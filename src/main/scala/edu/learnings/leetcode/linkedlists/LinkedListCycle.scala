package edu.learnings.leetcode.linkedlists


object LinkedListCycle extends App {


  def hasCycle(head: ListNode): Boolean = {
    @scala.annotation.tailrec
    def go(slow: ListNode, fast: ListNode): Boolean = {
      if (fast == null || fast.next == null) false
      else if (fast == slow) true
      else go(slow.next, fast.next.next)
    }

    if (head == null || head.next == null) false else go(head.next, head.next.next)
  }

  def detectCycle(head: ListNode): ListNode = {
    @scala.annotation.tailrec
    def hasMeetingNode(slow: ListNode, fast: ListNode): Option[ListNode] = {
      if (fast == null || fast.next == null) None
      else if (fast == slow) Some(slow)
      else hasMeetingNode(slow.next, fast.next.next)
    }

    @scala.annotation.tailrec
    def getLoopStartNode(x: ListNode, y: ListNode): ListNode = {
      println(s"(${x.x}, ${y.x})")
      if (x == y) x else getLoopStartNode(x.next, y.next)
    }

    if (head == null || head.next == null) null else {
      hasMeetingNode(head.next, head.next.next) match {
        case None => null
        case Some(meetingNode) => println(s"meeting node:${meetingNode.x}")
          getLoopStartNode(head, meetingNode)
      }
    }
  }
}
