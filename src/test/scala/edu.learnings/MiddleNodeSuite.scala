package edu.learnings

import edu.learnings.lc.{ListNode, MiddleNode}

class MiddleNodeSuite extends BaseSuite {

  test("Linked list with single node should return the same node") {
    val smallestList = new ListNode(1)
    assert(MiddleNode.middleNode(smallestList) == smallestList)
  }

  test("Linked list with odd number of elements (1,2,3) should return node(3)") {
    val n1: ListNode = new ListNode(1)
    val n2: ListNode = new ListNode(2)
    val n3: ListNode = new ListNode(3)
    n1.next = n2
    n2.next = n3

    assert(MiddleNode.middleNode(n1) == n2)

  }

  test("Linked list with even number of elements (1,2,3,4) should return node(3)") {
    val n1: ListNode = new ListNode(1)
    val n2: ListNode = new ListNode(2)
    val n3: ListNode = new ListNode(3)
    val n4: ListNode = new ListNode(4)
    n1.next = n2
    n2.next = n3
    n3.next = n4
    assert(MiddleNode.middleNode(n1) == n3)
  }

  test("Linked list with even number 1,2,3,4,5,6 should return 4th node") {
    val n1: ListNode = new ListNode(1)
    val n2: ListNode = new ListNode(2)
    val n3: ListNode = new ListNode(3)
    val n4: ListNode = new ListNode(4)
    val n5: ListNode = new ListNode(5)
    val n6: ListNode = new ListNode(6)

    n1.next = n2
    n2.next = n3
    n3.next = n4
    n4.next = n5
    n5.next = n6
    assert(MiddleNode.middleNode(n1) == n4)

  }

}
