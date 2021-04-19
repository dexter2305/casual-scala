package edu.learnings.leetcode.linkedlists

case class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}

object ListNode extends App {

  var head = ListNode(Array(1, 2, 3))
  while (head != null) {
    println(head.x)
    head = head.next
  }

  def asString(node: ListNode, delimiter: String = "-"): String = {
    @scala.annotation.tailrec
    def go(n: ListNode, acc: String): String = {
      if (n == null) acc
      else {
        acc match {
          case "" => go(n.next, n.x.toString)
          case _ => go(n.next, acc + delimiter + n.x.toString)
        }
      }
    }
    go(node, "")
  }

  def apply(elements: Array[Int]): ListNode = {
    var head: ListNode = null
    for (i <- elements.indices) {
      if (head == null)
        head = new ListNode(elements(i))
      else {
        var t = head
        while (t.next != null) t = t.next
        val x = new ListNode(elements(i))
        t.next = x
      }
    }
    head
  }
}

