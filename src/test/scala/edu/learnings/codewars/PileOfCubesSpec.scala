package edu.learnings.codewars

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PileOfCubesSpec extends FlatSpec with Matchers{

  "Pile of cubes" should " be 3 when volume is 36" in {
    val pileOfCubes = new PileOfCubes
    pileOfCubes.findNb(36) shouldEqual 3
  }

  it should "be -1 when volume is 37" in {
    val pileOfCubes = new PileOfCubes
    pileOfCubes.findNb(37) shouldEqual -1
  }

}
