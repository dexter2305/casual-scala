package xplore.learnings.leetcode.linkedlists

object OddEvenLinkedList extends App {

  def oddEvenList(head: ListNode): ListNode = {
    @scala.annotation.tailrec
    def go(odd: ListNode, even: ListNode): (ListNode, ListNode) = {
      if (even != null && even.next != null) {
        odd.next = even.next
        even.next = even.next.next
        go(odd.next, even.next)
      } else {
        (odd, even)
      }
    }
    if (head == null) head
    else {
      val odd = head
      val even = head.next
      val evenHead = even
      val (co, ce) = go(odd, even)
      co.next = evenHead
      head
    }

  }

}
