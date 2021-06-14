package xplore.learnings.leetcode

import xplore.learnings.BaseFlatSpec

import scala.util.Random

class MaxNumberOfKSumPairsSpec extends BaseFlatSpec {

  private val i = new MaxNumberOfKSumPairs

  "1,2,3,4 with k=5" should "be 2" in {
    i.maxOperations(Array(1, 2, 3, 4), 5) shouldEqual 2
  }

  "3,1,3,4,3 with k=6" should "1" in {
    i.maxOperations(Array(3, 1, 3, 4, 3), 6) shouldEqual 1
  }

  "1,10,9,2,11 with k= 11" should "be 2" in {
    i.maxOperations(Array(1, 10, 9, 2, 11), 11) shouldEqual 2
  }

  "100, 200, 50, 250 with k as 10" should "0" in {
    i.maxOperations(Array(100, 200, 50, 250), 10) shouldBe 0
  }

  s"Performance test" should s"complete within stipulated time ${timeLimit.toMillis}ms" in {
    val r: Random = Random
    val input = (for (_ <- 1 to math.pow(10, 5).toInt) yield {
      r.nextInt(math.pow(10, 9).toInt)
    }).toArray
    val k = r.nextInt(math.pow(10, 9).toInt)
    i.maxOperations(input, k)
  }

}
