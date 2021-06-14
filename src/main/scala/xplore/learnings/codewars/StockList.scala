package xplore.learnings.codewars

class StockList {

  def stockSummary(lstOfArt: Array[String], lstOfCat: Array[String]): String = {

    val stocksByIndex: Map[String, Int] = lstOfArt.map(s => (s.charAt(0), s.substring(s.indexOf(" ") + 1, s.length)))
      .map(tuple => tuple._1 -> tuple._2.toInt)
      .groupBy(tuple => tuple._1)
      .map(t => t._1 -> t._2.map(r => r._2))
      .map(t => t._1.toString -> t._2.sum)

    val result = lstOfCat
      .map(x => (x, stocksByIndex.getOrElse(x, 0)))

    val formatted = if (result.count(t => t._2 > 0) > 0) {
      result.map(tuple => "(" + tuple._1 + " : " + tuple._2 + ")")
        .mkString(" - ")
    } else ""
    println(formatted)
    formatted
  }

}

object StockList {
  def main(args: Array[String]): Unit = {

    val sampleMap = Map(1 -> 'a', 2 -> 'b', 3 -> 'c')

    println(s"${sampleMap.getOrElse(4, 'x')}")

    val s = "123"
    println(s"${s.toInt}")
    val stockList = new StockList
    stockList.stockSummary(Array("BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"), Array("A", "B", "C", "D"))
  }
}