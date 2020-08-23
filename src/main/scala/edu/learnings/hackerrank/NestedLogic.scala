package edu.learnings.hackerrank

object NestedLogic {

  def main(args: Array[String]): Unit = {
    val receivedDateAsArray = scala.io.StdIn.readLine().split(" ").take(3).map(s => s.toInt)
    val expectedDateAsArray = scala.io.StdIn.readLine().split(" ").take(3).map(s => s.toInt)
    val receivedDate = Date(receivedDateAsArray)
    val expectedDate = Date(expectedDateAsArray)
    val penalty = evalPenalty(receivedDate, expectedDate)
    println(s"received: $receivedDate")
    println(s"expected: $expectedDate")
    println(s"penalty: $penalty")
    println(s"$penalty")
  }

  class Date(val date: Int, val month: Int, val year: Int) {
    override def toString: String = s"$date-$month-$year"
  }

  object Date {
    def apply(dateArray: Array[Int]): Date = {
      new Date(dateArray(0), dateArray(1), dateArray(2))
    }
  }

  def evalPenalty(receivedDate: Date, expectedDate: Date): Int = {
    if (receivedDate.year < expectedDate.year) 0
    else if (receivedDate.year > expectedDate.year) 10000
    else if (receivedDate.month > expectedDate.month) 500 * (receivedDate.month - expectedDate.month)
    else if (receivedDate.date > expectedDate.date) 15 * (receivedDate.date - expectedDate.date)
    else 0

  }
}
