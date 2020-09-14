package edu.learnings.interviewbit

import edu.learnings.BaseSuite

class SelectionSortSuite extends  BaseSuite {

  test("empty list is returned as empty list"){
    assertResult(List[Int]())(SelectionSort.sort(List[Int]()))
  }

  test("list of duplicates"){
    assertResult(List(1,1,1))(SelectionSort.sort(List(1,1,1)))
  }

  test("distinct unsorted input"){
    assertResult(List(1,2,3,4))(SelectionSort.sort(List(2,4,1,3)))
  }

  test("unsorted array with duplicated"){
    assertResult(List(1,2,3,3,4))(SelectionSort.sort(List(2,3,4,1,3)))
  }
}
