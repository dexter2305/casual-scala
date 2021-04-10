package edu.learnings.leetcode.arrays

import edu.learnings.{BaseFlatSpec, BaseFunSpec, BaseFunSuite}

class RemoveDuplicatesFromSortedArraySpec extends BaseFunSpec {

  describe("remove duplicates from sorted set") {
    it ("should pass given tests "){
      assertResult(2)(RemoveDuplicatesInSortedArray.removeDuplicates(Array(1,1,2)))
      assertResult(5)(RemoveDuplicatesInSortedArray.removeDuplicates(Array(1,1,1,2,2,3,4,4,4,5)))
    }
    it ("should handle empty set"){
      assertResult(0)(RemoveDuplicatesInSortedArray.removeDuplicates(Array.empty))
    }
    it ("should handle array with single element"){
      assertResult(1)(RemoveDuplicatesInSortedArray.removeDuplicates(Array(100)))
    }
  }

}
