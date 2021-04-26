package edu.learnings.leetcode.linkedlists

case class ListNode(_x: Int = 0, _next: ListNode = null) {
  var next: ListNode = _next
  var x: Int = _x

  override def toString: String = {
    @scala.annotation.tailrec
    def makeString(n: ListNode, acc: String): String = {
      if (n == null) acc else acc match {
        case "" => makeString(n.next, n.x.toString)
        case _ => makeString(n.next, acc + "-" + n.x.toString)
      }
    }

    val head = this
    makeString(head, "")
  }
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

  @scala.annotation.tailrec
  def sameElements(a: ListNode, b: ListNode): Boolean = {
    (a, b) match {
      case (null, null) => true
      case (null, _) | (_, null) => false
      case (a, b) => if (a.x != b.x) false else sameElements(a.next, b.next)
    }
  }
}

