package edu.learnings.leetcode.strings

import edu.learnings.BaseFlatSpec

class GoalParserSpec extends BaseFlatSpec {

  "Goal parser" must "return Goal for G()(al)" in {
    GoalParser.interpret("G()(al)") shouldBe "Goal"
  }

  it must "handle repetitive ()" in {
    GoalParser.interpret("G()()()()()()(al)") shouldBe "Gooooooal"
  }

  it must "handle repetitive (al)" in {
    GoalParser.interpret("G()(al)(al)(al)") shouldBe "Goalalal"
  }

  it must "handle all repeatable chars" in {
    GoalParser.interpret("(al)G(al)()()G") shouldBe "alGalooG"
  }

}
