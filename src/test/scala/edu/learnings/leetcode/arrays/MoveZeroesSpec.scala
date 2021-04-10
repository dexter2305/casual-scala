package edu.learnings.leetcode.arrays

import edu.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MoveZeroesSpec extends BaseFunSpec {

  describe("Move Zeroes") {
    it("array with zero") {
      val l = Array(0, 1, 0, 3, 12)
      MoveZeroes.moveZeroes(l)
      assertResult(Array(1, 3, 12, 0, 0))(l)
    }

    it("array without zero should not be affected") {
      val l = Array(1, 2, 3)
      MoveZeroes.moveZeroes(l)
      assertResult(Array(1, 2, 3))(l)
    }

    it("empty should be unaffected") {
      val l = Array.empty[Int]
      MoveZeroes.moveZeroes(l)
      assert(l.isEmpty)
    }

    it ("array with consecutive zeroes") {
      val l = Array(1,0,0,0,2,0)
      MoveZeroes.moveZeroes(l)
      assertResult(Array(1,2,0,0,0,0))(l)
    }

    it ("array with all zeros") {
      val l = Array(0,0,0)
      MoveZeroes.moveZeroes(l)
      assert (l.sameElements(Array(0,0,0)))
    }
  }
}
