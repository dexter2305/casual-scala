package edu.learnings.leetcode.linkedlists

object MergeTwoSortedLists {

  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    @scala.annotation.tailrec
    def go(p: ListNode, q: ListNode, acc: ListNode, head: ListNode): ListNode = {

      (p, q) match {
        case (null, null) => null
        case (a, null) => if (acc == null) a else {
          acc.next = a
          head
        }
        case (null, b) => if (acc == null) b else {
          acc.next = b
          head
        }
        case (a, b) => if (a.x <= b.x) {
          if (acc == null) go(a.next, b, a, a)
          else {
            acc.next = a
            go(a.next, b, a, head)
          }
        } else {
          if (acc == null) go(a, b.next, b, b)
          else {
            acc.next = b
            go(a, b.next, b, head)
          }
        }
      }
    }

    go(l1, l2, null, null)
  }
}
