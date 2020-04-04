
package edu.learnings.lc

import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

import edu.learnings.lc.HappyNumber

@RunWith(classOf[JUnitRunner])
class HappyNumberSuite extends FunSuite{

  test("1 is a happy number") {
    assert(HappyNumber.isHappy(1))
  }

  test("0 is not a happy number") {
    assert(HappyNumber.isHappy(0) == false)
  }

  test("19 is a happy number") {
    assert(HappyNumber.isHappy(19))
  }

  test("25 is not a happy number") {
    assert(!HappyNumber.isHappy(25))
  }

  test("1589 is not a happy number") {
    assert(!HappyNumber.isHappy(1589))
  }

  test("sumOfSquaredDigits(1)") {
    assert(HappyNumber.sumOfSquaredDigits(1) == 1)
  }

  test("sumOfSquaredDigits(89)") {
    assert(HappyNumber.sumOfSquaredDigits(89) == (Math.pow(8,2) + (Math.pow(9,2)) ) )
  }

}