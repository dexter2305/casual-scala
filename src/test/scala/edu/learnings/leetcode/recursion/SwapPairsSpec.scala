package edu.learnings.leetcode.recursion

import edu.learnings.BaseFlatSpec
import edu.learnings.leetcode.linkedlists.ListNode

class SwapPairsSpec extends BaseFlatSpec {

  "swapPairs" should "swap (even length) 1->2->3->4 to 2->1->4->3" in {
    SwapPairs.swapPairs(ListNode(Array(1,2,3,4))).asString() shouldBe ListNode(Array(2,1,4,3)).asString()
  }

  it should "swap (odd length) 1->2->3 to 2->1->3" in {
    SwapPairs.swapPairs(ListNode(Array(1,2,3))).asString() shouldBe ListNode(Array(2,1,3)).asString()
  }

  it should "return same when length == 1" in (SwapPairs.swapPairs(new ListNode(1)).asString() shouldBe ListNode(Array(1)).asString())

  it should "return null when input is null" in (SwapPairs.swapPairs(null) shouldBe null)

}
