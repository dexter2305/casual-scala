package edu.learnings

object HR30DayCode {
  def main(args: Array[String]): Unit = {
    //day1_DataTypes()
    println(mealCost(12, 20, 8))
    println(day3_ConditionalStatements(2))
    day5_Loops(2)
    println(day7_Arrays(Array(1,2,3,4,5,6)))
  }

  def day1_DataTypes(): Unit = {
    val int: Int = scala.io.StdIn.readInt()
    val double: Double = scala.io.StdIn.readDouble()
    val string: String = scala.io.StdIn.readLine()
    println(int + double)
    println(double + double)
    println("HackerRank " + string)
  }

  def mealCost(meal_cost: Double, tip_percent: Int, tax_percent: Int): Int = {
    Math.round(meal_cost + (meal_cost * tip_percent / 100) + meal_cost * tax_percent / 100).toInt
  }

  def day3_ConditionalStatements(given: Int): String = {
    if (given % 2 != 0) "Weird"
    else {
      if (given >= 2 && given <= 5) "Not Weird"
      if (given >= 6 && given <= 20) "Weird"
      else "Not Weird"
    }
  }

  def day5_Loops(n: Int): Unit = {
    for (i <- 1 to 10) {
      println(s"$n x $i = " + (n * i))
    }
  }

  def day7_Arrays(numbers: Array[Int]): String = {
    numbers.reverse.mkString(" ")
  }

}


