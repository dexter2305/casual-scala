package edu.learnings.hackerrank

import edu.learnings.BaseSpec

class UtopianTreeSpec extends BaseSpec{

  "Utopian tree height" should " be 1 after 0 cycles" in {
    assertResult(1)(UtopianTree.utopianTree(0))
  }

  it should " be 7 after 4 cycles" in {
    assertResult(7)(UtopianTree.utopianTree(4))
  }

  it should " be 14 after 5 cycles" in {
    assertResult(14)(UtopianTree.utopianTree(5))
  }

}
