
package edu.contest.hackerearth

import scala.annotation.tailrec

object HackerEarth extends App{

  countOfDigits()

  def countOfDigits(): Unit = {
    val input = scala.io.StdIn.readLine()
    val x = input.toCharArray.filter(_.isDigit).groupBy(identity).map(tuple => (tuple._1.asDigit, tuple._2.length))
    val nums = input.toCharArray.filter(_.isDigit).map(_.asDigit)
    for (i <- 0 to 9){
      println(s"$i ${nums.count(_ == i)}")
      //println(s"$i ${x.getOrElse(i,0)}")
    }
  }

  @tailrec
  def lifeUniverseAndEverything(): Unit = {
    scala.io.StdIn.readLine() match {
      case "42" => None
      case v => println(s"$v")
        lifeUniverseAndEverything()
    }
  }

  def isPalindrome(given: String): String = {
    if (given.equals(given.reverse)) {
      "YES"
    } else "NO"
  }

  def toggleString(input: String): String = {
    input.toCharArray().map(c => if (c.isLower) c.toUpper else c.toLower).mkString
  }

  def monkAndWelcomeProblemInput(): (Array[Int], Array[Int]) = {
    val inputSize = scala.io.StdIn.readInt()
    val ar1 = scala.io.StdIn.readLine().split(" ").take(inputSize).map(s => s.toInt)
    val ar2 = scala.io.StdIn.readLine().split(" ").take(inputSize).map(s => s.toInt)
    (ar1, ar2)
  }

  def monkAndWelcomeProblem(ar1: Array[Int], ar2: Array[Int]): IndexedSeq[Int] = {
    for { i <- 0 until ar1.length } yield { ar1(i) + ar2(i) }

  }

  def findLastOccurenceBy1IndexInput(): (Array[Int], Int) = {
    val line1 = scala.io.StdIn.readLine()
    val arraySize = line1.split(" ")(0).toInt
    val n = line1.split(" ")(1).toInt
    val numbers = scala.io.StdIn.readLine().split(" ").map(c => c.toInt)
    (numbers, n)
  }
  def findLastOccurenceBy1Index(numbers: Array[Int], n: Int): Int = {
    numbers.lastIndexOf(n) + 1
  }

  def findIndexOfInput(): (Int, Array[Int]) = {
    val size = scala.io.StdIn.readInt
    val numbers: Array[Int] = scala.io.StdIn.readLine().split(" ").take(size).map(c => c.toInt)
    val n: Int = scala.io.StdIn.readInt
    (n, numbers)
  }
  def findIndexOf(n: Int, numbers: Array[Int]): Int = {
    numbers.indexOf(n)
  }

  def factorial(n: Int): Int = {
    def helper(n: Int, acc: Int = 1): Int = {
      n match {
        case 1 => acc * 1
        case _ => helper(n - 1, acc * n)
      }
    }
    helper(n)
  }

  def countOfDivisorsInput(): (Int, Int, Int) = {
    val l = scala.io.StdIn.readInt
    val r = scala.io.StdIn.readInt
    val k = scala.io.StdIn.readInt
    (l, r, k)
  }
  def countOfDivisors(l: Int, r: Int, k: Int): Int = {
    (l to r).groupBy(n => n % k == 0).get(true).get.size
  }

}