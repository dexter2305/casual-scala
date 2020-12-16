package edu.learnings.hackerrank

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ElectronicShopFlatSpec extends FlatSpec with Matchers{


  "ElectronicShop.getMoneySpent" should " With budget as 5, keyboards[4] mouse [5] be -1 " in {
    val shop = new ElectronicShop
    shop getMoneySpent(Array(4), Array(5), 5) should be (-1)
  }

  it should " be 9 with budget = 10, k = '3,1' and m = '5,2,8'" in {
    val shop = new ElectronicShop
    shop.getMoneySpent(Array(3,1), Array(5,2,8), 10) shouldEqual 9
  }
}
