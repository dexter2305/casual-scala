package edu.learnings

import scala.annotation.tailrec

object Lc1290 {

  def main(args: Array[String]): Unit = {
    val n1 = new ListNode(1)
    val n0 = new ListNode(0)
    val n11 = new ListNode(1)
    n0.next = n11
    n1.next = n0
    println(getDecimalValueUsingString(n1))
    println(getDecimalValUsingInt(n1))
  }

  def getDecimalValueUsingString(head: ListNode): Int = {
    @tailrec
    def helper(node: ListNode, acc: String): String = {
      if (node == null) {
        println(s"returning $acc")
        acc
      } else {
        println(acc)
        helper(node.next, acc + node._x)
      }
    }

    Integer.parseInt(helper(head, ""), 2)
  }

  def getDecimalValUsingInt(head: ListNode): Int = {

      def size(head: ListNode): Int = {
        @tailrec
        def count(node: ListNode, c:Int) : Int = {
          node match {
            case node if (node == null) => c
            case _ => count(node.next, c + 1)
          }
        }
        count(head, 0)
      }

      @tailrec
      def asInt(node: ListNode, high: Int, acc: Int): Int = {
        if (null == node) {
          acc
        } else {
          asInt(node.next, high -1, acc + (node._x * Math.pow(2, high).toInt) )
        }

      }
      asInt(head,size(head) -1, 0)
  }
}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
