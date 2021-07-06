package xplore.learnings.leetcode.linkedlists

import xplore.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class OddEvenLinkedListSpec extends BaseFunSpec {

  describe("OddEvenLinkedList") {
    it("empty list should return same") {
      val empty = null
      OddEvenLinkedList.oddEvenList(empty) shouldBe null
    }

    it ("list with odd number of nodes"){
      val nodes = ListNode(Array(1,2,3,4,5))
      val ans = OddEvenLinkedList.oddEvenList(nodes)

      ans.x shouldBe 1
      ans.next.x shouldBe 3
      ans.next.next.x shouldBe 5
      ans.next.next.next.x shouldBe 2
      ans.next.next.next.next.x shouldBe 4

    }
    it ("list with even number of nodes"){
      val nodes = ListNode(Array(1,2,3,4))
      val ans = OddEvenLinkedList.oddEvenList(nodes)
      println(s"${ListNode.asString(ans)}")
      ans.x shouldBe 1
      ans.next.x shouldBe 3
      ans.next.next.x shouldBe 2
      ans.next.next.next.x shouldBe 4
      ans.next.next.next.next shouldBe null
    }

    it ("list with only one node"){
      val nodes = ListNode(Array(1))
      val ans = OddEvenLinkedList.oddEvenList(nodes)

      ans.x shouldBe 1
      ans.next shouldBe null

    }

    it ("list with 2 nodes"){
      val nodes = ListNode(Array(1,2))
      val ans = OddEvenLinkedList.oddEvenList(nodes)

      ans.x shouldBe 1
      ans.next.x shouldBe 2
      ans.next.next shouldBe null
    }
  }

}
