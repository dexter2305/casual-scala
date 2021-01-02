package edu.learnings.codewars

import edu.learnings.BaseFlatSpec

class PileOfCubesSpec extends BaseFlatSpec {

  "Pile of cubes" should " be 3 when volume is 36" in {
    val pileOfCubes = new PileOfCubes
    pileOfCubes.findNb(36) shouldEqual 3
  }

  it should "be -1 when volume is 37" in {
    val pileOfCubes = new PileOfCubes
    pileOfCubes.findNb(37) shouldEqual -1
  }

}
