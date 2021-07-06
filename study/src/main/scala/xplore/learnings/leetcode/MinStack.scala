package xplore.learnings.leetcode

class MinStack {

  var current: MintNode = _

  def push(x: Int): Unit = {
    val start = System.nanoTime()
    current = if (current == null) {
      MintNode(x, x, null)
    } else {
      MintNode(x, Math.min(x, current.min), current)
    }
    println(s"pushed: $current")
    val elapsed = System.nanoTime() - start
    //println(s"t(${current.value}) = ${elapsed}")
  }

  def pop(): Unit = {
    if (current != null) {
      val prev = current.prev
      current = prev
      //println(s"popped -- $current")
    }
  }

  def top(): Int = {
    if (current != null) {
      current.value
    } else {
      throw new RuntimeException("Empty stack")
    }
  }

  def getMin(): Int = {
    if (current != null) {
      current.min
    } else {
      throw new RuntimeException("Empty stack")
    }
  }

  case class MintNode(value: Int, min: Int, prev: MintNode) {
    override def toString: String = String.valueOf(value) + " - " + {
      if (prev == null) "" else prev.value
    }
  }

}
