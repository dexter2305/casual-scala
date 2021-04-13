package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFlatSpec

class LinkedListCycleSpec extends BaseFlatSpec {

  "An empty list" should "not have cycle" in {
    LinkedListCycle.hasCycle(null) shouldBe false
  }

  "List with only head " should "not have cycle" in {
    val node = new ListNode()
    LinkedListCycle.hasCycle(node) shouldBe false
  }

  "1->2->3" should "not have cycle" in {
    val one = new ListNode(1)
    val two = new ListNode(2)
    val three = new ListNode(3)
    one.next = two
    two.next = three

    LinkedListCycle.hasCycle(one) shouldBe false
  }

  "1->2->3->4->2" should "have cycle" in  {
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

  "last node pointing to itself" should "have cycle" in  {
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
