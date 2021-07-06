package xplore.learnings.leetcode.linkedlists

import xplore.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class RemoveValueFromLinkedListSpec extends BaseFunSpec {

  describe("Remove given value from Linkedlist") {
    it("should remove all occurrences of given value") {
      Given("list (1,2,2,2,3,4")
      val one = ListNode(Array(1, 2, 2, 2, 3, 4))
      When("all nodes of 2 should be removed")
      val n = RemoveValueFromLinkedList.removeElements(one, 2)
      Then("items should be 1-3-4")
      n.x shouldBe 1
      n.next.x shouldBe 3
      n.next.next.x shouldBe 4
    }

    it("should remove elements from head if matched") {
      Given("list (2,1,3,4")
      val node = ListNode(Array(2, 1, 3, 4))
      When("2 should be removed")
      val n = RemoveValueFromLinkedList.removeElements(node, 2)
      Then("1-3-4 should be list")
      n.x shouldBe 1
      n.next.x shouldBe 3
      n.next.next.x shouldBe 4
    }

    it("should remove elements from tail if matched") {
      Given("list (1,3,4,2")
      val node = ListNode(Array(1, 3, 4, 2))
      When("2 should be removed")
      val n = RemoveValueFromLinkedList.removeElements(node, 2)
      Then("1-3-4 should be list")
      n.x shouldBe 1
      n.next.x shouldBe 3
      n.next.next.x shouldBe 4
    }

    it("should return the same list when it is empty") {
      Given("an empty list")
      val empty = null
      When("to remove an element")
      val ans = RemoveValueFromLinkedList.removeElements(empty, 0)
      Then("expect return to be null/empty")
      ans shouldBe empty
    }

    it("no change to list when element is not found") {

      Given("list (2,1,3,4")
      val node = ListNode(Array(1, 3, 4, 2))
      When("100 should be removed")
      val n = RemoveValueFromLinkedList.removeElements(node, 100)
      Then("1-3-4 should be list")
      n.x shouldBe 1
      n.next.x shouldBe 3
      n.next.next.x shouldBe 4
      n.next.next.next.x shouldBe 2

    }

  }

}
