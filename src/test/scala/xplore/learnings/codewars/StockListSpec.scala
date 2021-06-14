package xplore.learnings.codewars

import xplore.learnings.BaseFlatSpec

class StockListSpec extends BaseFlatSpec {

  val stockList = new StockList
  "StockList " should " return type string" in {
    stockList.stockSummary(Array.empty, Array.empty) should equal("")

  }
  it should " pass basic tests " in {
    stockList.stockSummary(Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"), Array("A", "B", "C", "D")) shouldEqual "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"
    stockList.stockSummary(Array("ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"), Array("A", "B")) shouldEqual "(A : 200) - (B : 1140)"
  }
}
