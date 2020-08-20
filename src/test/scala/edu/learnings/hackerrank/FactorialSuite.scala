package edu.learnings.hackerrank

import edu.learnings.BaseSuite

class FactorialSuite extends BaseSuite{

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
