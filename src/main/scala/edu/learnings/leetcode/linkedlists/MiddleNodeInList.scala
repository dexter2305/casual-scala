package edu.learnings.leetcode.linkedlists

object MiddleNodeInList {

  def middleNode(head: ListNode): ListNode = {
    @scala.annotation.tailrec
    def go(slow: ListNode, fast: ListNode): ListNode = {
      fast match {

        case null /* l(list) is even */ => slow.next
        case x if x.next /* l(list) is odd */ == null => slow.next
        case _ => go(slow.next, fast.next.next)
      }
    }

    val a = head match {
      case null => null
      case x if x.next == null => x
      case _ => go(head, head.next.next)
    }

    //println(s"${a.x}")
    a
  }
}
