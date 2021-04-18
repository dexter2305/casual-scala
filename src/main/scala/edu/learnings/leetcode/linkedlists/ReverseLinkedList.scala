package edu.learnings.leetcode.linkedlists

object ReverseLinkedList extends App {

  val h = ListNode(Array(1,2,3))
  var a = reverseListWithRecursion(h)
  while (a != null) {
    println(a.x)
    a = a.next
  }

  def reverseList(head: ListNode): ListNode = {
    reverseListWithRecursion(head)
  }

  def reverseListWithRecursion(head: ListNode): ListNode = {
    @scala.annotation.tailrec
    def go(prev: ListNode, current: ListNode, next: ListNode): ListNode = {
      println(s"(${if (prev != null) prev.x else prev}, ${current.x}, ${next.x})")
      current.next = prev
      if (next.next != null) go(current, next, next.next)
      else {
        next.next = current
        next
      }

    }
    head match {
      case null => head
      case x if x != null && x.next == null => x
      case _ => go(null, head, head.next)
    }
  }

  def reverseListWithLoop(head: ListNode): ListNode = {
    var current = head
    var next = head
    var prev: ListNode = null

    while (current != null) {
      next = current.next
      current.next = prev
      prev = current
      current = next
    }
    prev
  }
}
