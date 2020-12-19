package edu.learnings.hackerrank

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ViralAdvertisingSpec extends FlatSpec with Matchers {

  val viralAdvertising = new ViralAdvertising

  "Viral Adversitising initial shared=5" should "be 5 for day=1" in {
    viralAdvertising.viralAdvertising(1) shouldBe 2
    viralAdvertising.viralAdvertising(6) shouldBe 13
  }

}
