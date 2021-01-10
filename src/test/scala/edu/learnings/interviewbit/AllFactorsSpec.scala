package edu.learnings.interviewbit

import edu.learnings.BaseFlatSpec

class AllFactorsSpec extends BaseFlatSpec {

  val i = new AllFactors

  "all factors of 6" should "be 1 2 3 6" in { i.allFactors(6) shouldBe Array(1, 2, 3, 6) }
  "all factors of 1" should "be 1" in { i.allFactors(1) shouldBe Array(1) }

  "all factors (concise code) of 6" should "be 1 2 3 6" in { i.allFactorsConciseCode(6) shouldBe Array(1, 2, 3, 6) }
  "all factors (concise code) of 1" should "be 1" in { i.allFactorsConciseCode(1) shouldBe Array(1) }


}
