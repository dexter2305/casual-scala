package xplore.learnings.concepts

import xplore.learnings.BaseFlatSpec

class ModValues extends BaseFlatSpec {

  "Mod value" should "5 % 4 = 1" in {
    5 % 4 shouldEqual 1
  }
  it should "4 % 4 == 0" in {
    4 % 4 shouldEqual 0
  }

  it should "(important) 3 % 4 == 3" in {
    3 % 4 shouldEqual 3
  }

}
