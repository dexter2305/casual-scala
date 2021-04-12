package edu.learnings.leetcode.linkedlists

class MyLinkedList() {

  /** Initialize your data structure here. */
  class Node(val value: Int) {
    var next: Node = null
  }

  var head: Node = null
  var length: Int = 0

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  def get(index: Int): Int = {
    if (head == null) -1
    else {
      var counter = 0
      var n = head
      while (counter != index && n != null) {
        println(s"value @$counter : ${n.value}")
        counter += 1
        n = n.next
      }
      if (counter == index && n != null) n.value else -1
    }
  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  def addAtHead(`val`: Int) {
    val newNode = new Node(`val`)
    if (head == null) head = newNode
    else {
      newNode.next = head
      head = newNode
    }
    length += 1
  }

  /** Append a node of value val to the last element of the linked list. */
  def addAtTail(`val`: Int) {
    val newNode = new Node(`val`)
    if (head == null) head = newNode
    else {
      var n = head
      while (n.next != null) n = n.next
      n.next = newNode
    }
    length += 1
  }

  /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
  def addAtIndex(index: Int, `val`: Int) {
    // 1 -> 2 -> 3
    // 0 .. 1 .. 2
    if (index <= length) {
      if (index == 0) addAtHead(`val`)
      else {
        val newNode: Node = new Node(`val`)
        var prev: Node = null
        var current: Node = head
        var counter: Int = 0
        while (counter < index) {
          prev = current
          current = current.next
          counter += 1
        }
        prev.next = newNode
        newNode.next = current
        length += 1
      }
    }
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  def deleteAtIndex(index: Int) {

    if (index <= length) {
      var counter: Int = 0
      var current: Node = head
      var prev: Node = null
      while (counter < index) {
        prev = current
        current = current.next
        counter += 1
      }
      if (current != null) {
        if (prev != null) prev.next = current.next
        else head = current.next
      } else prev.next = null

      length -=1
    }
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * var obj = new MyLinkedList()
 * var param_1 = obj.get(index)
 * obj.addAtHead(`val`)
 * obj.addAtTail(`val`)
 * obj.addAtIndex(index,`val`)
 * obj.deleteAtIndex(index)
 */
object MyLinkedList {

  def main(args: Array[String]): Unit = {
    val list = new MyLinkedList()
    list.addAtHead(10)
    list.addAtHead(20)

  }

}