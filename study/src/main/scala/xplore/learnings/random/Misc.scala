package xplore.learnings.random

import scala.annotation.tailrec

case class Person(name: String) {
  override def toString: String = super.toString
}

class Node(value: Int)

class PlayLazyEvaluation {

  def play(n: Int): Unit = {
    lazy val l: LazyList[Int] = 1 #:: l.map(_ + 1)
    println(s"${l.take(n).toList.mkString("-")}")
  }
}

object Misc extends App {

  def playWithLazyList(): Unit ={
    val i = new PlayLazyEvaluation
    i.play(100)
  }

  def printIterator(): Unit = {
    @tailrec
    def printIterator(iterator: Iterator[_]): Unit = {
      if (iterator.hasNext) {
        iterator.next() match {
          case arrayOfChar: Array[Char] => println(s"${arrayOfChar.mkString(" ")}")
            printIterator(iterator)
          case _ => println("n/a")
        }
      } else {
        println("end of stream")
      }
    }

    val vowels: Array[Char] = Array('a', 'e', 'i', 'o', 'u')

    val iterator: Iterator[Array[Char]] = vowels.combinations(5)
    printIterator(iterator)
  }

  def charsAsInts(): Unit = {
    println(s"a = ${'a'.toInt}")
    println(s"A = ${'A'.toInt}")
    for (i <- 97 until (97 + 26)) (print(s"($i,${i.toChar}) "))
    println("")
    for (i <- 65 until (65 + 26)) (print(s"($i,${i.toChar}) "))
  }


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
