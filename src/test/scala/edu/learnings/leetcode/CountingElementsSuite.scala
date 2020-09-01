package edu.learnings.leetcode

import edu.learnings.BaseSuite

class CountingElementsSuite extends BaseSuite {

  test("Array with no elements present") {
    assert(CountingElements.countingElements(Array(1, 3, 5)) == 0)
  }
  test("Array with 2 distinct elements present") {
    assert(CountingElements.countingElements(Array(1, 2, 3, 5)) == 2)
  }
  test("Array with 2 duplicated elements present") {
    assert(CountingElements.countingElements(Array(1, 1, 2, 5)) == 2)
  }
  test("Array with 1 negative number") {
    assert(CountingElements.countingElements(Array(-1, 0, 2, 3, 5)) == 2)
  }
  test("With MAX_VAL") {
    assert(CountingElements.countingElements(Array(scala.Int.MaxValue, scala.Int.MaxValue + 1)) == 1)
  }
  test("Empty array should return 0") {
    assert(CountingElements.countingElements(Array()) == 0)
  }
  test("leetcode test (1,1,3,3,5,5,7,7) == 0") {
    assert(CountingElements.countingElements(Array(1, 1, 3, 3, 5, 5, 7, 7)) == 0)
  }
  test("leetcode test (1,1,2,2) == 2") {
    assert(CountingElements.countingElements(Array(1, 1, 2, 2)) == 2)
  }
  test("leetcode test (1,3,2,3,5,0) == 3"){
    assert(CountingElements.countingElements(Array(1,3,2,3,5,0)) == 3)
  }
  test("Testing large array (10^6) with (n-1) elements present") {
    val end = 1_000_000
    val largeArray = (0 until end).toArray
    val start = System.nanoTime()
    val actual = CountingElements.countingElements(largeArray)
    val resptime = System.nanoTime() - start
    println(s"time taken for unique $end numbers is $resptime ~ ${resptime / 1_000_000}ms")
    assert(actual == end - 1)
  }
}
