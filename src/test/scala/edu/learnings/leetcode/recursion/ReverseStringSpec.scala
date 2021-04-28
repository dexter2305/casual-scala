package edu.learnings.leetcode.recursion

import edu.learnings.BaseFlatSpec

class ReverseStringSpec extends BaseFlatSpec {

  "reverseString" should "reverse strings of length odd" in {
    val data =  Array('h','e','l','l', 'o')
    ReverseString.reverseString(data)
    data shouldBe Array('o','l','l','e','h')
  }

  it should "reverse of length even" in {
    val data =  Array('h','e','l','l', 'o','s')
    ReverseString.reverseString(data)
    data shouldBe Array('s','o','l','l','e','h')
  }

  it should "not change when length is 1" in {
    val data = Array('a')
    ReverseString.reverseString(data)
    data shouldBe data
  }
}
