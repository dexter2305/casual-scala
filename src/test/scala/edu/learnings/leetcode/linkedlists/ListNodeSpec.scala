package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper


class ListNodeSpec extends BaseFunSpec {

  describe("ListNode") {
    describe("sameElements") {
      it("should return true for list with identical values [1,2,3] [1,2,3]") {
        ListNode.sameElements(ListNode(Array(1, 2, 3)), ListNode(Array(1, 2, 3))) shouldBe true
      }

      it("should return true for list with null") {
        ListNode.sameElements(null, null) shouldBe true
      }

      it("should return false for list with different values [1,2,3] [2,2,2]") {
        ListNode.sameElements(ListNode(Array(1, 2, 3)), ListNode(Array(2, 2, 2)))
      }

      it("should return false for list with different values towards end of list [1,2] [1,2,3,4]") {
        ListNode.sameElements(ListNode(Array(1, 2)), ListNode(Array(1, 2, 3, 4))) shouldBe false
      }
    }
  }

}
