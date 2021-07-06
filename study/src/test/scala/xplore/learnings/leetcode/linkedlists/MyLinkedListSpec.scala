package xplore.learnings.leetcode.linkedlists

import xplore.learnings.BaseFunSpec

class MyLinkedListSpec extends BaseFunSpec {

  describe("MyLinkedList - 0-indexed") {
    it("should addAtHead") {
      Given("empty list ")
      val l = new MyLinkedList
      When("an element is added at head")
      l.addAtHead(10)
      Then("get(0) should be the same element just added")
      assertResult(10)(l.get(0))
    }

    it("should return -1 when not initialized") {
      Given("an empty list")
      val l = new MyLinkedList()
      Then("return -1")
      assertResult(-1)(l.get(0))
      l.addAtHead(20)
      l.addAtHead(10)
      assertResult(-1)(l.get(100))

    }

    it("should add elements at tail") {
      Given("a list with 2 elements")
      val l = new MyLinkedList
      l.addAtHead(2)
      l.addAtHead(1)
      When("add a new element to tail")
      l.addAtTail(100)
      Then("item at (2) should be 100")
      assertResult(100)(l.get(2))
    }

    it("should add elements at non-zero index") {
      Given("a list with 2 elements")
      val l = new MyLinkedList
      l.addAtHead(2)
      l.addAtHead(1)
      When("a new element is added at index 2")
      l.addAtIndex(2, 3)
      Then("get (2) should return the same element added")
      assertResult(3)(l.get(2))
    }

    it("should add element to 0th index") {
      Given("a list with 2 elements")
      val l = new MyLinkedList
      l.addAtHead(2)
      l.addAtHead(1)
      When("an element is added at 0th index")
      l.addAtIndex(0, 3)
      Then("get(0) should return the same element")
      assertResult(3)(l.get(0))

    }

    it("should not add when index is beyond then range") {
      Given("a list with 2 elements")
      val l = new MyLinkedList
      l.addAtHead(2)
      l.addAtHead(1)
      When("add at index out range is used")
      l.addAtIndex(1000, 1000)
      Then("new element is not added")
      assertResult(-1)(l.get(2))
    }

    it("should allow delete at head index (0)") {
      Given("a list with two elements 1 -> 2 -> nil")
      val l = new MyLinkedList
      l.addAtHead(2)
      l.addAtHead(1)
      When("deleteAtIndex is called at index 0")
      l.deleteAtIndex(0)
      Then("get(0) should be 2")
      assertResult(2)(l.get(0))
    }

    it("should allow delete at tail index") {
      Given("a list with two elements 1 -> 2 -> nil")
      val l = new MyLinkedList
      l.addAtHead(2)
      l.addAtHead(1)
      When("deleteAtIndex is called at index 1")
      l.deleteAtIndex(1)
      Then("get(0) should be 2")
      assertResult(-1)(l.get(1))
      And("previous element is still the only element in list")
      assertResult(1)(l.get(0))
    }

    it("delete at index outside range of length is ignored") {
      Given("a list with 2 elements 1->2->nil")
      val l = new MyLinkedList
      l.addAtHead(2)
      l.addAtHead(1)
      When("delete at index > 1 is called")
      l.deleteAtIndex(100)
      Then("no change to the list")
      assertResult(1)(l.get(0))
      assertResult(2)(l.get(1))
    }

  }

}
