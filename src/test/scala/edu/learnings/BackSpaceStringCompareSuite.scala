package edu.learnings

import edu.learnings.leetcode.BackSpaceStringCompare

class BackSpaceStringCompareSuite extends BaseSuite {

  test("abc# == ab"){
    assert(BackSpaceStringCompare.backspaceCompare("abc#", "ab"))
  }

  test("abc## == a"){
    assert(BackSpaceStringCompare.backspaceCompare("abc##", "a"))
  }

  test("## == ''"){
    assert(BackSpaceStringCompare.backspaceCompare("##", ""))
  }

  test("abc == abc"){
    assert(BackSpaceStringCompare.backspaceCompare("abc", "abc"))
  }

  test("abb#c#c == abc"){
    assert(BackSpaceStringCompare.backspaceCompare("abb#c#c", "abc"))
  }

  test(" #a == a"){
    assert(BackSpaceStringCompare.backspaceCompare(" #a", "a"))
  }

  test("ab## == c#d#"){
    assert(BackSpaceStringCompare.backspaceCompare("ab##", "c#d#"))
  }

  test("ab#c == ad#c"){
    assert(BackSpaceStringCompare.backspaceCompare("ab#c", "ad#c"))
  }

  test("a##c == #a#c"){
    assert(BackSpaceStringCompare.backspaceCompare("a##c", "#a#c"))
  }

  test("a#c == b"){
    assert(!BackSpaceStringCompare.backspaceCompare("a#c", "b"))
  }
}
