package edu.learnings.hackerrank

import edu.learnings.BaseFlatSpec

import scala.util.Random

class AlternatingCharactersSpec extends BaseFlatSpec {

  private val instance = new AlternatingCharacters

  "AlternatingCharacters" should "0 deletions for ABAB " in {
    instance.alternatingCharacters("ABAB") shouldEqual 0
  }

  it should "2 deletions for AAAB" in {
    instance.alternatingCharacters("AAAB") should be(2)
  }

  it should "3 deletions for AAAA" in {
    instance.alternatingCharacters("AAAA") shouldEqual 3
  }

  it should "complete within 7 seconds" in {
    val random: Random = Random
    val charsAsList: Seq[Char] = for (_ <- 0 until math.pow(10, 5).toInt) yield if (random.nextBoolean()) {
      'A'
    } else {
      'B'
    }
    val input = charsAsList.mkString("")
    //println(s"length of input ${input.length}")
    val x = instance.alternatingCharacters(input)
    println(s"$x")
  }
}
