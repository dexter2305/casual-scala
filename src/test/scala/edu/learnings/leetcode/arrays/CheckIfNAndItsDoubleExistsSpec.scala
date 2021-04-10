package edu.learnings.leetcode.arrays

import edu.learnings.BaseFlatSpec

class CheckIfNAndItsDoubleExistsSpec extends BaseFlatSpec{

  "simple case : double exists " should "pass with (10,2,5,3)" in {
    CheckIfNAndItsDoubleExists.checkIfExist(Array(10,2,5,3)) shouldBe true
  }

  "simple case : double does not exist " should "pass with (7,1,14,11)" in {
    CheckIfNAndItsDoubleExists.checkIfExist(Array(7,1,14,11)) shouldBe true
  }

  "simple case : double does not exist " should "pass with (3,1,7,11)" in {
    CheckIfNAndItsDoubleExists.checkIfExist(Array(3,1,7,11)) shouldBe false
  }
}
