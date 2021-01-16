package edu.learnings.random

object Misc extends App {


  val list = List.empty[Int]
  val nlist = list :+ 1 :+ 2
  println(s"${nlist.mkString(" ")}")

  def learningReduceFunction(): Unit = {
    val numbers = Seq(1, 2, 3, 3, 5)
    numbers.reduce((x, y) => x - y)
    val x = numbers.groupBy(id => id)
      .map(x => (x._1, x._2.size))
    println(x.mkString("\n"))
    x.reduce((x, y) => {

      val result = if (x._2 > y._2) x
      else if (y._2 > x._2) y
      else if (x._1 < y._1) x
      else y

      val res = (1, 2)
      println(s"$x vs $y =  $result")
      result
    })
  }

  def convertDecToOtherBases(n: Int): Unit = {
    println(s"binary($n) = ${n.toBinaryString}")
    println(s"octal($n) = ${n.toOctalString}")
    println(s"hexa($n) = ${n.toHexString}")
  }

  def testZipWithIndex(): Unit = {
    val x = 11

    val y = x.toString
      .zipWithIndex
      .map(tuple => tuple._1 + 1)

    println(x.toString.toCharArray.zipWithIndex.mkString(" "))
    println(y.mkString(" "))
  }

}
