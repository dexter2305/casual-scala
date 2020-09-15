package edu.learnings.leetcode

import edu.learnings.BaseFunSuite

class MoveZeroesSuite extends BaseFunSuite {

  test("array with no zeroes") {
    val array = Array(1, 2, 3, 4, 5)
    assert(MoveZeroes.moveZeroes(array).sameElements(array))
  }

  test("array with scattered zeroes"){
    val array = Array(2,3,0,1,0,5)
    assert(MoveZeroes.moveZeroes(array).sameElements(Array(2,3,1,5,0,0)) )
  }

  test("array with only zeroes"){
    val array = Array(0,0,0,0)
    assert(MoveZeroes.moveZeroes(array).sameElements(array) )
  }

  test("array with moved zeroes"){
    val array = Array(2,3,4,0,0,0)
    assert(MoveZeroes.moveZeroes(array).sameElements(array) )
  }

  test("array with leading zero"){
    val array = Array(0,0,0,2,3)
    assert(MoveZeroes.moveZeroes(array).sameElements(Array(2,3,0,0,0)) )
  }
}
