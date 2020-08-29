package edu.learnings.hackerrank

import edu.learnings.BaseSpec

class AngryProfessorSpec extends BaseSpec {

  "Professor " should " cancel for min:3 & [-1 -1 2 4]" in {
    assertResult("YES")(AngryProfessor.angryProfessor(3, Array(-1, -1, 2, 4)))
  }

  "Professor " should "not cancel for min:2 & [-1 -1 0 0]" in {
    assertResult("NO")(AngryProfessor.angryProfessor(2, Array(-1, -1, 0, 0)))
  }

  "Professor " should "not cancel for min:2 & [-1 -1 10 10]" in {
    assertResult("NO")(AngryProfessor.angryProfessor(2, Array(-1, -1, 10, 10)))
  }

  "Professor " should "not cancel for min:0 & [-1 -1 -1 -1]" in {
    assertResult("NO")(AngryProfessor.angryProfessor(0, Array(-1, -1, -1, -1)))
  }

  "Professor " should "not cancel for min:0 & [10 10 10 10]" in {
    assertResult("NO")(AngryProfessor.angryProfessor(0, Array(10, 10, 10, 10)))
  }
}
