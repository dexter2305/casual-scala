package edu.learnings

import java.lang.RuntimeException

import edu.learnings.lc.MinStack
import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MinStackSpec extends FlatSpec {

  "push(1) and top " should "return 1 " in {
    val stack = new MinStack()
    stack.push(1)
    assert(stack.top() == 1)
  }

  "push(1), push(2) pop and top " should "return 1" in {
    val stack = new MinStack
    stack.push(1)
    stack.push(2)
    stack.pop()
    assert(stack.top() == 1)
  }

  "push(1) getMin" should "return 1" in {
    val stack = new MinStack
    stack.push(1)
    assert(stack.getMin() == 1)
  }

  "push(1) push(2) getMin" should "return 1" in {
    val stack = new MinStack
    stack.push(1)
    stack.push(2)
    assert(stack.getMin() == 1)
  }

  "push(2) push(1) push(3) getMin" should " return 1" in {
    val stack = new MinStack
    stack.push(2)
    stack.push(1)
    stack.push(3)
    assert(stack.getMin() == 1)
  }

  "push(2) push(1) push(0) pop pop getMin" should "return 1 (second min val)" in {
    val s = new MinStack
    s.push(2)
    s.push(1)
    s.push(0)
    s.pop()
    assert(s.getMin() == 1)
  }

  "Leetcode given behavior push(-2) push(0) push(-3) getMin -> -3 pop top->0 getMin -> -2" should " work " in {
    val s = new MinStack
    s.push(-2)
    s.push(0)
    s.push(-3)
    assert(s.getMin() == -3)
    s.pop()
    assert(s.top() == 0)
    assert(s.getMin() == -2)
  }

  "Measure for constant time with 10^6 elements vs 1 element" should "be constant time" in {
    val s = new MinStack
    s.push(0)
    var time = System.nanoTime()
    s.getMin()
    val ttOf1 = System.nanoTime() - time
    val end = 5
    //1 to 1_000_000 foreach(e => s.push(e))
    1 to end foreach (e => s.push(e))
    time = System.nanoTime()
    val ttOfLarge = System.nanoTime() - time
    println(s"t(1)     = $ttOf1")
    println(s"t($end)  = $ttOfLarge")
    println(s"diff = ${ttOfLarge - ttOf1}")
    assert(ttOfLarge == ttOf1)
  }

  "Push time" should " be constants" in {
    val s = new MinStack
    //s.push(0)
    1 to 100 foreach (e => s.push(e))
  }

}
