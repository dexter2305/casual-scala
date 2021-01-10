package edu.learnings.hackerrank

import edu.learnings.BaseFlatSpec

class SherlockAndSquaresSpec extends BaseFlatSpec {

  val i = new SherlockAndSquares
  "3 to 9" must "have 2 " in {
    i.squares(3, 9) shouldBe 2
  }

  "17 till 24" should "have 0" in {
    i.squares(17, 24) shouldBe 0
  }

  "100 - 1000" should "have 22" in {
    i.squares(100, 1000) shouldBe 22
  }

  s"Performance test" should s"pass in ${timeLimit.toMillis} ms" in {
    i.squares(1, math.pow(10, 9).toInt)
  }
}
