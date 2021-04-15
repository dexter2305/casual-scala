package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class IntersectionOfTwoLinkedListsSpec extends BaseFunSpec {

  describe("Intersection of two linked lists"){
    it ("should return null when no intersection"){

      Given("two non empty lists that do not merge")
      val one = new ListNode(1)
      one.next = new ListNode(2)
      one.next.next = new ListNode(3)

      val ten = new ListNode(10)
      ten.next = new ListNode(11)
      Then("return null")
      assertResult(null)(IntersectionOfTwoLinkedLists.getIntersectionNode(one, ten))

    }

    it ("should handle null") {
     val one = new ListNode(1)
      one.next = new ListNode(2)
      Given("2 heads of input lists")
      Then("should return null when headB is null")
      assertResult(null)(IntersectionOfTwoLinkedLists.getIntersectionNode(one, null))
      And("should return null when headA is null")
      assertResult(null)(IntersectionOfTwoLinkedLists.getIntersectionNode(null, one))
      And("should return null when both are null")
      assertResult(null)(IntersectionOfTwoLinkedLists.getIntersectionNode(null, null))
    }

    it ("should detect intersection") {


      val one = new ListNode(1)
      one.next = new ListNode(2)
      one.next.next = new ListNode(3)

      val ten = new ListNode(10)
      ten.next = new ListNode(11)
      ten.next.next = one.next


      IntersectionOfTwoLinkedLists.getIntersectionNode(one, ten) shouldBe one.next

    }
  }
}
