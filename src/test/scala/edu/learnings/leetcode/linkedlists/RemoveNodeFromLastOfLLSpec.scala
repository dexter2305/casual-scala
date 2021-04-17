package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFunSpec
import edu.learnings.leetcode.linkedlists.RemoveNodeFromLastOfLL.removeNthFromEnd
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class RemoveNodeFromLastOfLLSpec extends BaseFunSpec {

  describe("RemoveNodeFromLinkedList") {
    it("should remove nth element from last of the list") {
      Given("a list (0,1,2,3)")
      val zero = new ListNode(0)
      val one = new ListNode(1)
      val two = new ListNode(2)
      val three = new ListNode(3)
      zero.next = one
      one.next = two
      two.next = three
      When("when 2nd element is to be remove from last")
      val head = removeNthFromEnd(zero, 2)
      Then("the list should be 0-1-3")
      head.next.next shouldBe three
    }

    it ("when list has only one node, it n = 1") {
      val one = new ListNode(1)
      val head =removeNthFromEnd(one, 1)
      head shouldBe null

    }

    ignore("testcase violates a constraint (1 <= n <= sz): no change when the n is out of range") {
      Given("a list (0,1,2,3)")
      val zero = new ListNode(0)
      val one = new ListNode(1)
      val two = new ListNode(2)
      val three = new ListNode(3)
      zero.next = one
      one.next = two
      two.next = three
      When("when element to removed is given 100 (greater than length of list)")
      val head = removeNthFromEnd(zero, 100)
      Then("the list should be 0-1-2-3")
      head shouldBe zero
      head.next shouldBe one
      head.next.next shouldBe two
      head.next.next.next shouldBe three
    }

    ignore ("testcase violates a constraint (1 <= n <= sz): no change when the n == 0") {
      Given("a list (0,1,2,3)")
      val zero = new ListNode(0)
      val one = new ListNode(1)
      val two = new ListNode(2)
      val three = new ListNode(3)
      zero.next = one
      one.next = two
      two.next = three
      When("when element to removed is given 100 (greater than length of list)")
      val head = removeNthFromEnd(zero, 0)
      Then("the list should be 0-1-2-3")
      head shouldBe zero
      head.next shouldBe one
      head.next.next shouldBe two
      head.next.next.next shouldBe three
    }


    ignore("testcase violates constraint (1 <= sz <= 30): should handle null list") {
      removeNthFromEnd(null, 100) shouldBe null
    }
  }

}
