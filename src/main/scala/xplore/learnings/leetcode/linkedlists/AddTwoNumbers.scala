package xplore.learnings.leetcode.linkedlists

/**
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse
 * order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * 2 -> 4 -> 3
 * 5 -> 6 -> 4
 *
 * expected 7 -> 0 -> 8
 *
 */
object AddTwoNumbers extends App {

  val l1 = ListNode(Array(2, 4, 3))
  val l2 = ListNode(Array(5, 6, 4))

  addTwoNumbers(l1, l2)


  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    val transform: (Int, Int, Int) => (Int, Int) = (x, y, c) => {
      val s = x + y + c
      (s % 10, s / 10)
    }

    @scala.annotation.tailrec
    def sum(x: ListNode, y: ListNode, carry: Int, current: ListNode): Unit = {
      (x, y) match {
        case (null, null) => if (carry > 0) current.next = ListNode(carry)
        case (null, b) => val (v, c) = transform(0, b.x, carry)
          current.next = new ListNode(v)
          sum(null, b.next, c, current.next)
        case (a, null) => val (v, c) = transform(a.x, 0, carry)
          current.next = new ListNode(v)
          sum(a.next, null, c, current.next)
        case (a, b) => val (v, c) = transform(a.x, b.x, carry)
          current.next = new ListNode(v)
          sum(a.next, b.next, c, current.next)
      }
    }

    val a = l1 //reverse(null, l1, l1.next)
    val b = l2 //reverse(null, l2, l2.next)
    val answer = new ListNode()
    println(s"${ListNode.asString(a)}")
    println(s"${ListNode.asString(b)}")
    sum(a, b, 0, answer)
    val d = answer.next
    println(s"${ListNode.asString(d)}")
    answer.next
  }


  def addTwoNumbers1(l1: ListNode, l2: ListNode): ListNode = {
    inc_add(l1, l2, 0)
  }

  def inc(x1: Int, x2: Int, inc_bit: Int) = {
    val sum: Int = x1 + x2 + inc_bit
    val carry: Int = sum / 10
    val nodeVal: Int = sum % 10
    (nodeVal, carry)
  }

  def inc_add(l1: ListNode, l2: ListNode, inc_bit: Int): ListNode = (l1, l2, inc_bit) match {
    case (null, null, 0) => null
    case (null, null, inc_bit) => new ListNode(inc_bit)
    case (null, l2, inc_bit) =>
      val (value, carry) = inc(0, l2.x, inc_bit)
      new ListNode(value, inc_add(null, l2.next, carry))
    case (l1, null, inc_bit) =>
      val (value, carry) = inc(0, l2.x, inc_bit)
      new ListNode(value, inc_add(l1.next, null, carry))
    case (l1, l2, inc_bit) =>
      val (value, carry) = inc(0, l2.x, inc_bit)
      new ListNode(value, inc_add(l1.next, l2.next, carry))
  }
}
