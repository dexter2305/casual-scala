package xplore.learnings.leetcode.strings

import xplore.learnings.BaseFlatSpec

class SplitStringInBalancedStringSpec extends BaseFlatSpec {

  "SplitStringInBalancedString" must "return 1 for 'RL'" in {
    SplitStringInBalancedString.balancedStringSplit("RL") shouldBe 1
  }

  it must "return 3 for RLLLLRRRLR " in (SplitStringInBalancedString.balancedStringSplit("RLLLLRRRLR") shouldBe 3)
  it must "return 1 for LLLLRRRR" in (SplitStringInBalancedString.balancedStringSplit("LLLLRRRR") shouldBe 1)
  it must "return 2 for RLRRRLLRLL" in (SplitStringInBalancedString.balancedStringSplit("RLRRRLLRLL") shouldBe 2)
}
