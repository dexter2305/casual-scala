package edu.learnings.hackerrank

object LonelyInteger {

  def main(args: Array[String]): Unit = {
    lonelyInteger(Array(10, 10, 11, 11, 10))
  }

  def lonelyInteger(a: Array[Int]): Int = {
    @scala.annotation.tailrec
    def toBinary(n: Int, acc: String = ""): String = {
      n match {
        case 0 => "0" + acc
        case 1 => "1" + acc
        case _ => toBinary(n / 2, s"${n % 2}" + acc)
      }
    }

    def toDecimal(n: Int, acc: Int = 0): Int = {
      n.toString.toCharArray
        .zipWithIndex
        .map(tuple => tuple._1.asDigit * scala.math.pow(2, tuple._2))
        .sum
        .toInt

    }
    val uniqueBinVal = a.map(e => toBinary(e)).map(e => e.toInt).foldLeft(0)((acc, e) => acc.toInt ^ e)
    val result = toDecimal(uniqueBinVal)

    println(s">> ${uniqueBinVal} & $result")

    uniqueBinVal
    //a.foldLeft(0)()
  }
}
