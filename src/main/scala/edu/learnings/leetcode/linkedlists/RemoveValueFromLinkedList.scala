package edu.learnings.leetcode.linkedlists

import edu.learnings.leetcode.linkedlists.RemoveValueFromLinkedList.n

object RemoveValueFromLinkedList extends App {

  val one = ListNode(Array(1,2,3,4))
  var n = one
  println("given list")
  printlist(n)
  n = removeElements(one, 2)
  printlist(n)


  def printlist(node: ListNode): Unit = {
    var n = node
    while(n != null){
      print(s"${n.x}")
      n = n.next
    }

  }

  def removeElements(head: ListNode, `val`: Int): ListNode = {

    @scala.annotation.tailrec
    def go(p: ListNode, s: ListNode): Unit = {
      if (p != null){
        if (p.x != `val`) {
          s.next = p
          go(p.next, s.next)
        }
        else go(p.next, s)
      } else {
        s.next = p
      }
    }

    val dummy = new ListNode()
    dummy.next = head
    go(head, dummy)
    dummy.next
  }
}
