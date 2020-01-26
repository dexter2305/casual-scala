
package edu.learnings;
object HackerEarth {

  def main(args: Array[String]): Unit = {
    //println(toggleString(scala.io.StdIn.readLine()))
    val (ar1, ar2) = monkAndWelcomeProblemInput()
    println(monkAndWelcomeProblem(ar1, ar2).mkString(" "))
  }

  def toggleString(input: String): String = {
    input.toCharArray().map(c => if (c.isLower) c.toUpper else c.toLower).mkString
  }

  def monkAndWelcomeProblemInput():(Array[Int], Array[Int]) = {
    val inputSize = scala.io.StdIn.readInt()
    val ar1 = scala.io.StdIn.readLine().split(" ").take(inputSize).map(s => s.toInt)
    val ar2 = scala.io.StdIn.readLine().split(" ").take(inputSize).map(s => s.toInt) 
    (ar1, ar2)
  }

  def monkAndWelcomeProblem(ar1: Array[Int], ar2: Array[Int]): IndexedSeq[Int] = {
    for {i <- 0 until ar1.length} yield {ar1(i) + ar2(i)}

  }


}