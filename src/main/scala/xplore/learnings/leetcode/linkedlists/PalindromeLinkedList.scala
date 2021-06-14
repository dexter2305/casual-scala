package xplore.learnings.leetcode.linkedlists

object PalindromeLinkedList extends App {

  val evenLength = ListNode(Array(1, 2, 3, 4))
  isPalindrome(evenLength)
  val oddLength = ListNode(Array(1, 2, 3, 2, 1))
  isPalindrome(oddLength)


  def isPalindrome(head: ListNode): Boolean = {
    def midNode(n: ListNode): ListNode = {
      @scala.annotation.tailrec
      def go(slow: ListNode, fast: ListNode): ListNode = {
        fast match {
          case null => slow.next
          case x if x.next == null => slow.next
          case _ => go(slow.next, fast.next.next)
        }
      }

      n match {
        case x if x.next == null => n.next
        case _ => go(n, n.next.next)
      }
    }

    def reverse(n: ListNode): ListNode = {
      @scala.annotation.tailrec
      def go(prev: ListNode, curr: ListNode, next: ListNode): ListNode = {
        curr.next = prev
        if (next != null) go(curr, next, next.next) else curr
      }

      go(null, n, n.next)
    }

    /** assumption is that b is the second half and `a`  is the first half */
    @scala.annotation.tailrec
    def compare(a: ListNode, b: ListNode): Boolean = {
      b match {
        case null => true
        case _ => if (b.x != a.x) false else compare(a.next, b.next)
      }
    }


    head match {
      case x if x.next == null => true
      case n =>
        val node = head
        //mid
        val mNode = midNode(node)
        //println(s"middle(${ListNode.asString({val x = head;x})}): ${mNode.x}")
        //reverse
        val toBeReversed = mNode
        val rSecondHalf = reverse(toBeReversed)
        //println(s"reversed second half ${ListNode.asString({val x = rSecondHalf;x})}")
        val firstHalf = head
        val secondHalf = rSecondHalf
        compare(firstHalf, secondHalf)

    }


  }
}
