
package edu.learnings.random

object HackerEarth {

  def main(args: Array[String]): Unit = {
    //println(toggleString(scala.io.StdIn.readLine()))
    //val (ar1, ar2) = monkAndWelcomeProblemInput()
    //println(monkAndWelcomeProblem(ar1, ar2).mkString(" "))
    //val(numbers, n) = findLastOccurenceBy1IndexInput()
    //println(findLastOccurenceBy1Index(numbers, n))
    //findLastOccurenceBy1Index(findLastOccurenceBy1IndexInput)
    //val (n, numbers) = findIndexOfInput()
    //println(findIndexOf(n, numbers))
    //println(factorial(scala.io.StdIn.readInt))
    //val (l, r, k) = countOfDivisorsInput
    //println(countOfDivisors(l, r, k))
    //println(isPalindrome(scala.io.StdIn.readLine))
    val n = scala.io.StdIn.readInt
    println(scala.io.StdIn.readLine.split(" ").take(n).mkString(" "))
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