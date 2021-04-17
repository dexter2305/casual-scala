package edu.learnings.leetcode.linkedlists

object RemoveNodeFromLastOfLL extends App {

  val one = new ListNode(1)
  one.next = new ListNode(2)
  one.next.next = new ListNode(3)
  one.next.next.next = new ListNode(4)

  val newHead = removeNthFromEnd(one, 4)

  var node = newHead
  while (node != null) {
    println(s"value is ${node.x}")
    node = node.next
  }


  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {

    val start = new ListNode(-23)
    start.next = head
    var fast = start
    var slow = start
    for (_ <- 1 to n) {
      fast = fast.next
    }
    while (fast.next != null) {
      println(s"(${fast.x}, ${slow.x})")
      fast = fast.next
      slow = slow.next
    }
    slow.next = slow.next.next
    start.next
  }

  def removeNthFromEnd2(head: ListNode, n: Int): ListNode = {
    @scala.annotation.tailrec
    def go(fast: ListNode, slow: ListNode, counter: Int): Unit = {
      if (fast != null) {
        println(s"counter: $counter, n: $n, fast: ${fast.x}, slow: ${slow.x}")
        if (counter >= n) go(fast.next, slow.next, counter + 1)
        else go(fast.next, slow, counter + 1)
      } else {
        if (slow.next.next != null) slow.next = slow.next.next
      }
    }

    go(head, head, -1)
    head
  }

  def removeNthFromEnd1(head: ListNode, n: Int): ListNode = {
    @scala.annotation.tailrec
    def go(first: ListNode, second: ListNode, counter: Int): Unit = {
      if (counter < n) {
        if (first != null) go(first.next, second, counter + 1)
      } else if (first.next != null) go(first.next, second.next, counter + 1)
      else second.next = second.next.next
    }

    (head, n) match {
      case (h, _) if h == null => null
      case (h, x) if x == 0 => h
      case _ => go(head, head, 0)
        head
    }

  }
}
