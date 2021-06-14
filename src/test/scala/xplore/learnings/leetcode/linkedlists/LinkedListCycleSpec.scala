package xplore.learnings.leetcode.linkedlists

import xplore.learnings.{BaseFlatSpec, BaseFunSpec}
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class LinkedListCycleSpec extends BaseFunSpec {

  describe("LinkedList") {
    describe("hasCycle") {
      it("should be false for empty list") {
        LinkedListCycle.hasCycle(null) shouldBe false
      }
      it("should be false only head not referring to itself as next") {
        LinkedListCycle.hasCycle(new ListNode()) shouldBe false
      }
      it("should return false for 1->2->3") {
        val one = new ListNode(1)
        val two = new ListNode(2)
        val three = new ListNode(3)
        one.next = two
        two.next = three
        LinkedListCycle.hasCycle(one) shouldBe false
      }
      it("should be true for 1-2-3-4-2") {
        val one = new ListNode(1)
        val two = new ListNode(2)
        val three = new ListNode(3)
        val four = new ListNode(4)
        one.next = two
        two.next = three
        three.next = four
        four.next = two
        LinkedListCycle.hasCycle(one) shouldBe true
      }
      it("should find cycle in single referring to itself as next") {
        val node = new ListNode(3)
        node.next = node
        LinkedListCycle.hasCycle(node) shouldBe true
      }
      it("should find cycle when last node points to self") {
        val one = new ListNode(1)
        val two = new ListNode(2)
        val three = new ListNode(3)
        val four = new ListNode(4)
        one.next = two
        two.next = three
        three.next = four
        four.next = four
        LinkedListCycle.hasCycle(one) shouldBe true
      }
    }
    describe("detectCycle"){
      it ("should detect start of cycles in linkedlist"){
        Given("list of 1-2-3-4-5-6-2")
        val one = new ListNode(1)
        val two = new ListNode(2)
        val three = new ListNode(3)
        val four = new ListNode(4)
        val five = new ListNode(5)
        val six = new ListNode(6)
        one.next = two
        two.next = three
        three.next = four
        four.next = five
        five.next = six
        six.next = two
        Then("cycle should be detected")
        LinkedListCycle.hasCycle(one) shouldBe true
        And("2 must be returned as start of cycle")
        LinkedListCycle.detectCycle(one) shouldBe two
      }
      it ("should return null when no cycle is found"){
        Given("list with no cycle")
        val one = new ListNode(1)
        val two = new ListNode(2)
        one.next = two
        Then("returns null")
        LinkedListCycle.detectCycle(one) shouldBe null
      }
    }
  }


}
