package edu.learnings.leetcode.linkedlists

object RotateList extends App {

  val l = ListNode((1 to 5).toArray)
  rotateRight(l, 1)

  def rotateRight(head: ListNode, k: Int): ListNode = {
    @scala.annotation.tailrec
    def length(node: ListNode, c: Int = 0): Int = {
      node match {
        case null => c
        case x => length(x.next, c + 1)
      }
    }

    def rotateIterative(head: ListNode, t: Int): ListNode = {
      var lead = head
      var trail = head
      var counter = 0
      while (lead.next != null) {
        lead = lead.next
        if (counter >= t) {
          trail = trail.next
        }
        counter += 1
      }
      lead.next = head
      val newHead = trail.next
      trail.next = null
      newHead
    }

    (head, k) match {
      case (null, _) => head
      case (_, 0) => head
      case (h, shift) =>
        val l = length(h)
        val r = shift % l
        if (r == 0) h else {
          println(s"length: $l, k: $k => $r ")
          rotateIterative(h, r)
        }
    }
  }
}
