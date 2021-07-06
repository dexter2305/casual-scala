package xplore.learnings.hackerrank

import xplore.learnings.BaseFlatSpec

class MarsExplorationSpec extends BaseFlatSpec {

  private val i = new MarsExploration
  "SOS" should "be 0" in {
    i.marsExploration("SOS") shouldBe 0
  }

  "SOSDDD" should "be 3" in {
    i.marsExploration("SOSDDD") shouldBe 3
  }

  "SOSSPSSQSSOR" should "be 3" in {
    i.marsExploration("SOSSPSSQSSOR") shouldBe 3
  }

  "SSSSSSSSSSSSSSSOOOOOOOOOOOOOOOOOOOOOOOOOSSSSSSSO" should "be 26" in {
    i.marsExploration("SSSSSSSSSSSSSSSOOOOOOOOOOOOOOOOOOOOOOOOOSSSSSSSO") shouldBe 26
  }
}
