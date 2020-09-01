package edu.learnings.leetcode

object MiddleNode {
  def main(args: Array[String]): Unit = {
    val n1:ListNode = new ListNode(1)
    val n2:ListNode = new ListNode(2)
    val n3:ListNode = new ListNode(3)
    val n4:ListNode = new ListNode(4)
    n1.next = n2
    n2.next = n3
    n3.next = n4
    println(s"middle node has value ${middleNode(n1)._x}")

  }

  def middleNode(head: ListNode): ListNode = {
    @scala.annotation.tailrec
    def helper(slow: ListNode, fast: ListNode): ListNode = {
      if (fast == null || fast.next == null) {
        slow
      } else {
        //println(s"slow(${slow._x}) fast(${fast._x})")
        helper(slow.next, fast.next.next)
      }
    }
    helper(head, head)
  }

}

class ListNode(var _x: Int = 0) {
  var next: ListNode = _
  var x: Int = _x
}


