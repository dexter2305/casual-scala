package edu.learnings.leetcode.linkedlists

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class PalindromeLinkedListSpec extends BaseFunSpec {

  describe("Palindrome Linked list") {

    it("should return true for [1,2,2,1] - even length palindrome") {
      PalindromeLinkedList.isPalindrome(ListNode(Array(1, 2, 2, 1))) shouldBe true
    }

    it("should return true for [1,2,3,4,5] - odd length palindrome") {
      val h = ListNode(Array(1, 2, 3, 2, 1))
      PalindromeLinkedList.isPalindrome(h) shouldBe true
    }

    it(" should return false for [1,1,2,1]") {
      val h = ListNode(Array(1, 1, 2, 1))
      Given(s"list ${ListNode.asString(h)}")
      Then("list is not palindrome")
      PalindromeLinkedList.isPalindrome(h) shouldBe false
    }

    ignore ("testcase violates given constraint: [The number of nodes in the list is in the range [1, 105].] should handle null") {
      PalindromeLinkedList.isPalindrome(null) shouldBe true
    }

    it("should return true for single node list") {
      PalindromeLinkedList.isPalindrome(new ListNode(1)) shouldBe true
    }
  }
}
