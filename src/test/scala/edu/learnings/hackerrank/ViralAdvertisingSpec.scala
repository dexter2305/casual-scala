package edu.learnings.hackerrank

import edu.learnings.BaseFlatSpec

class ViralAdvertisingSpec extends BaseFlatSpec {

  val viralAdvertising = new ViralAdvertising

  "Viral advertising initial shared=5" should "be 5 for day=1" in {
    viralAdvertising.viralAdvertising(1) shouldBe 2
    viralAdvertising.viralAdvertising(6) shouldBe 13
  }

}
