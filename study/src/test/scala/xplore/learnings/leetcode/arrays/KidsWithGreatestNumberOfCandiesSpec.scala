package xplore.learnings.leetcode.arrays

import xplore.learnings.BaseFlatSpec

class KidsWithGreatestNumberOfCandiesSpec extends BaseFlatSpec {

  val i = new KidsWithGreatestNumberOfCandies
  "2,3,5,1,3 with extra candies = 3" should "be true,true,true,false,true" in {
    i.kidsWithCandies(Array(2,3,5,1,3), 3) shouldBe Array(true,true,true,false,true)
  }

  "4,2,1,1,2 with extracandies = 1" should "true,false,false,false,false" in {
    i.kidsWithCandies(Array(4,2,1,1,2), 1) shouldBe Array(true,false,false,false,false)
  }

  "12,1,12 with extra candies = 10" should "be true, false, true" in {
    i.kidsWithCandies(Array(12,1,12), 10) shouldBe Array(true, false, true)
  }

}
