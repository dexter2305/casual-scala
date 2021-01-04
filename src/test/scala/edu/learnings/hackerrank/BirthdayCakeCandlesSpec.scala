package edu.learnings.hackerrank

import edu.learnings.BaseFlatSpec

import scala.util.Random

class BirthdayCakeCandlesSpec extends BaseFlatSpec {

  val i = new BirthdayCakeCandles
  "4 4 2 3" should " be 2" in {
    i.birthdayCakeCandles(Array(4, 4, 2, 3)) shouldBe 2
  }

  "6 4 4 2 3" should " be 1" in {
    i.birthdayCakeCandles(Array(6, 4, 4, 2, 3)) shouldBe 1
  }

  "4 4 4 4" should " be 4" in {
    i.birthdayCakeCandles(Array(4, 4, 4, 4)) shouldBe 4
  }

  s"${timeLimit.toSeconds} seconds based performance test" should " yield result " in {
    val r: Random = Random
    val input: Seq[Int] = for (_ <- 0 until math.pow(10, 7).toInt) yield r.nextInt(math.pow(10, 5).toInt)
    i.birthdayCakeCandles(input.toArray)
  }
}
