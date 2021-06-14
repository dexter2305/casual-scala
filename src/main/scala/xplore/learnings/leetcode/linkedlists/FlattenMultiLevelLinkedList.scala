package xplore.learnings.leetcode.linkedlists

object FlattenMultiLevelLinkedList extends App {

  val one = Node(1)
  val two =  Node(2)
  val three =  Node(3)
  val four =  Node(4)
  val five =  Node(5)
  val six =  Node(6)
  val seven =  Node(7)
  val eight =  Node(8)
  val nine =  Node(9)
  val ten =  Node(10)
  val eleven =  Node(11)
  val twelve =  Node(12)

  one.next = two
  two.prev = one
  one.child = three


  var h = one
  println("before flattening")
  while (h.next != null) {
    print(s"${h.value} ")
    h = h.next
  }
  print(s"${h.value} ")
  h = flatten(one)
  println("\nafter flattening")
  while (h.next != null) {
    print(s"${h.value} ")
    h = h.next
  }
  print(s"${h.value} ")

  while(h.prev != null) {
    print(s"${h.value} ")
    h=h.prev
  }
  print(s"${h.value} ")

  def flatten(head: Node): Node = {
    var current: Node = head
    while (current != null) {
      if (current.child == null) current = current.next
      else {
        val oldNextNode = current.next
        val newNextNode = flatten(current.child)
        current.next = newNextNode
        newNextNode.prev = current
        current.child = null
        var newPrevious = newNextNode
        while (newPrevious.next != null) newPrevious = newPrevious.next
        newPrevious.next = oldNextNode
        if (oldNextNode != null) {
          oldNextNode.prev = newPrevious
        }
      }
    }
    head
  }
}
