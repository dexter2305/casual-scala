package edu.learnings.hackerrank

class ElectronicShop {

  def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {

    val values = for {
      k <- keyboards
      d <- drives
      if k + d <= b
    } yield {
      k + d
    }
    values.maxOption match {
      case Some(n) => n
      case None => -1
    }
  }

}

object ElectronicShop {

  def main(args: Array[String]): Unit = {
    val shop = new ElectronicShop
    println(s"${shop.getMoneySpent(Array(3, 1), Array(5, 2, 8), 9)}")
  }
}
