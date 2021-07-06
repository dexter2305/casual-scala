package xplore.learnings.hackerrank

import xplore.learnings.BaseFunSuite

class FactorialSuite extends BaseFunSuite{

  test("0! is 1"){
    assertResult(1)(Factorial.factorial(0))
  }

  test("1! is 1"){
    assertResult(1)(Factorial.factorial(1))
  }

  test("5! is 120"){
    assertResult(120)(Factorial.factorial(5))
  }
}
