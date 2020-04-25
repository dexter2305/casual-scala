package edu.learnings.ib

import edu.learnings.BaseSuite
import edu.learnings.ib.BubbleSort
class BubbleSortSuite extends BaseSuite{

  test("empty array is sorted") {
    assertResult(List[Int]())(BubbleSort(List()))
  }

  test("1,4,2 sorted as 1,2,4"){
    assertResult(List(1,2,4))(BubbleSort(List(1,4,2)))
  }

  test("list of duplicates 2,2,2"){
    assertResult(List(2,2,2))(BubbleSort(List(2,2,2)))
  }

}