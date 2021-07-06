package xplore.learnings.codewars

import xplore.learnings.BaseFunSuite

class MultiplicationTableFunSuite extends BaseFunSuite{
  val instance = new MultiplicationTable
  test("should work with example tests") {
    assert(instance.multiplicationTable(1) == List(List(1)))
    assert(instance.multiplicationTable(2) == List(List(1, 2), List(2, 4)))
    assert(instance.multiplicationTable(3) == List(List(1, 2, 3), List(2, 4, 6), List(3, 6, 9)))
  }}
