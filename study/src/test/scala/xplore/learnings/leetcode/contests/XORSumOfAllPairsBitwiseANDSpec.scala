package xplore.learnings.leetcode.contests

import xplore.learnings.BaseFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class XORSumOfAllPairsBitwiseANDSpec extends BaseFunSpec {

  describe("XORSumOf all pairs bitwise AND"){
    it ("for [12] & [4], return 4") {
      XORSumOfAllPairsBitwiseAND.getXORSum(Array(12), Array(4)) shouldBe 4
    }
    it ("for [1,2,3] & [6,5], return 0") {
      XORSumOfAllPairsBitwiseAND.getXORSum(Array(1,2,3), Array(6,5)) shouldBe 0
    }
  }

}
