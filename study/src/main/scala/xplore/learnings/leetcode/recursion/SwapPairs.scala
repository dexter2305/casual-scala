package xplore.learnings.leetcode.recursion

import xplore.learnings.leetcode.linkedlists.ListNode

object SwapPairs extends App {

  val d = ListNode(Array(1, 2, 3, 4))
  val x = swapPairs(d)
  println(s"${x.asString()}")

  def swapPairsElaborate(head: ListNode): ListNode = {
    @scala.annotation.tailrec
    def go(h: ListNode): Unit = {
      val first = h.next
      if (first != null) {
        val second = first.next
        if (second != null) {
          val t = second.next
          h.next = second
          second.next = first
          first.next = t
          go(first)
        }
      }
    }

    val dummy = new ListNode()
    dummy.next = head
    go(dummy)
    dummy.next
  }

  def swapPairs(head: ListNode): ListNode = {
    if (head == null || head.next == null) head
    else {
      val newHead = head.next

      head.next = swapPairs(newHead.next)
      newHead.next = head

      newHead
    }
  }
}
