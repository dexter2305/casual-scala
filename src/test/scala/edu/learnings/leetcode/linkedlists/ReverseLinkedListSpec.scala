package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ReverseLinkedListSpec extends BaseFunSpec {

  describe("ReverseLinkedList") {
    it ("should reverse a non empty list of size greater than 1") {
      Given("a list 1-2-3-4")
      val head = ListNode(Array(1,2,3,4))
      When("upon reversal")
      val rHead = ReverseLinkedList.reverseLinkedListWithRecursionV2(head)
      println(s"${ListNode.asString(rHead)}")
      Then("list should be inverted")
      rHead.x shouldBe 4
      rHead.next.x shouldBe 3
      And("list ends with null")
      rHead.next.next.next.next shouldBe null
    }

    it ("should handle empty list ") {
      val h = new ListNode(9)
      val a = ReverseLinkedList.reverseLinkedListWithRecursionV2(h)
      a shouldBe h
      a.next shouldBe null

    }

    it ("should handle null ") {
      val h = null
      val a = ReverseLinkedList.reverseLinkedListWithRecursionV2(h)
      a shouldBe h
      
    }
  }

}
