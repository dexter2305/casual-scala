package edu.learnings.lc

object PlusOne {

  def main(args: Array[String]): Unit = {
    println(s"${plusOne(Array(1, 2, 3)).mkString(" ")}")
  }


  def plusOne(digits: Array[Int]): Array[Int] = {
    def helper(rdigits: List[Int]): List[Int] = {
      println(s"${rdigits.mkString(" ")}")
      if (rdigits.isEmpty) return List(1)
      val addOne = rdigits.head + 1
      if (addOne < 10)
        addOne :: rdigits.tail
      else {
        val remain = addOne % 10
        remain :: helper(rdigits.tail)
      }
    }

    helper(digits.reverse.toList).toArray.reverse
  }

  def plusOne_failsForLargeArray(digits: Array[Int]): Array[Int] = {

    val num: Int = digits.foldLeft((0, digits.length - 1))((t, e: Int) => {
      (t._1 + (e * Math.pow(10, t._2).toInt), t._2 - 1)
    })._1


    def intAsArray(num: Int): Array[Int] = {
      def aux(num: Int, acc: List[Int]): Array[Int] = {
        num < 10 match {
          case true => (num +: acc).toArray
          case false => aux(num / 10, num % 10 +: acc)
        }
      }

      aux(num, List[Int]())
    }

    val plusOne = intAsArray(num + 1)
    println(s"${digits.mkString(" ")} => $num | ${num + 1} => ${plusOne.mkString(" ")}")
    plusOne
  }

}
