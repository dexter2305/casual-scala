package xplore.learnings.hackerrank

import xplore.learnings.BaseFunSuite

class PrimeSuite extends BaseFunSuite {

  test("0 is not a prime number") {
    assertResult(false)(Prime.isPrime(0))
  }
  test("1 is not a prime number") {
    assertResult(false)(Prime.isPrime(1))
  }
  test("2 is a prime number") {
    assertResult(true)(Prime.isPrime(2))
  }

  test("11 is a prime number") {
    assertResult(true)(Prime.isPrime(11))
  }

  test("20 is not a prime number") {
    assertResult(false)(Prime.isPrime(20))
  }


}
