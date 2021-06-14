package xplore.learnings.leetcode

import xplore.learnings.BaseFlatSpec

import scala.util.Random

class ValidParenthesisSpec extends BaseFlatSpec {

  val i = new ValidParenthesis

  "()" should "be true" in {
    i.isValid("()") shouldBe true
  }

  "{}" should "be true" in {
    i.isValid("{}") shouldBe true
  }

  "[]" should "be true" in {
    i.isValid("[]") shouldBe true
  }

  "()[]{}" should "be true" in {
    i.isValid("()[]{}") shouldBe true
  }

  "(]" should "be false" in {
    i.isValid("(]") shouldBe false
  }

  "([)]" should "be false" in {
    i.isValid("([)]") shouldBe false
  }

  "{[]}" should "be true" in {
    i.isValid("{[]}") shouldBe true
  }

  ")()" should "be false" in {
    i.isValid(")()") shouldBe false
  }

  "()(" should "be false" in {
    i.isValid("()(") shouldBe false
  }

  "(((" should "be false" in {
    i.isValid("(((") shouldBe false
  }

  "valid string of length 10^4" should "be true" in {
    val input = (for (i <- 1 to math.pow(10, 4).toInt) yield if (i % 2 == 0) ')' else '(').toList.mkString("")
    println(s"length: ${input.length}... char(0...4): ${input.substring(0, 3)} and last few: ${input.substring(input.length - 4, input.length)}")
    i.isValid(input) shouldBe true
  }

  "invalid string (at pos=0) of large size " should "be false" in {
    val input = (for (i <- 1 until math.pow(10, 4).toInt) yield if (i % 2 == 0) ')' else '(').toList.mkString("") + "{"
    println(s"length: ${input.length}... char(0...4): ${input.substring(0, 3)} and last few: ${input.substring(input.length - 4, input.length)}")
    i.isValid(input) shouldBe false
  }

  "invalid string at pos = n of large size " should "be false" in {
    val input = "]" + (for (i <- 1 until math.pow(10, 4).toInt) yield if (i % 2 == 0) ')' else '(').toList.mkString("")
    println(s"length: ${input.length}... char(0...4): ${input.substring(0, 3)} and last few: ${input.substring(input.length - 4, input.length)}")
    i.isValid(input) shouldBe false
  }

}
