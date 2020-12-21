package edu.learnings.hackerrank

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SaveThePrisonerSpec extends FlatSpec with Matchers{

  private val savePrisoner = new SaveThePrisoner
  "Prisoner to save" should " 3 with prisoners: 4, candies: 6 and starting from 2" in {
    savePrisoner.saveThePrisoner(4, 6, 2) shouldEqual 3
  }

  it should "3 with prisoner: 4, candies: 2 and starting from 2" in {
    savePrisoner.saveThePrisoner(4, 2, 2) shouldEqual 3
  }

  it should "1 with prisoner: 4, candies: 4 and starting from 2" in {
    savePrisoner.saveThePrisoner(4, 2, 4) shouldEqual 1
  }

  it should "6 with p:7, c:19, s:2" in {
    savePrisoner.saveThePrisoner(7,19,2) shouldEqual 6
  }

  it should "3 with p:3 c:7 s:3" in {
    savePrisoner.saveThePrisoner(3,7,3) shouldEqual 3
  }

}
