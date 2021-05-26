package edu.learnings.leetcode

import edu.learnings.BaseFreeSpec

class ReversePolishNotationSpec extends BaseFreeSpec {

  "Reverse Polish Notation " - {
    "return 3 for [2,1,+]" in {
      ReversePolishNotation.evalRPN(Array("2", "1", "+")) mustBe 3
    }
    "handle negative numbers" in {
      ReversePolishNotation.evalRPN(Array("2","-3", "+")) mustBe -1
    }
  }
}
