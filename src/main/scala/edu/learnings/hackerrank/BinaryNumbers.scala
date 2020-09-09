package edu.learnings.hackerrank

object BinaryNumbers {

  def main(args: Array[String]): Unit = {
    //val n = scala.io.StdIn.readInt()
    println(consecutive1s(13))
    println(consecutive1s(439))
  }

  def consecutive1s(n: Int): Int = {
    @scala.annotation.tailrec
    val asBinary: Int => String = n => {
      @scala.annotation.tailrec
      def helper(n: Int, acc: String = ""): String = {
        if (n < 2) {
          n.toString + acc
        } else {
          helper(n / 2, (n % 2).toString + acc)
        }
      }

      val bin = helper(n)
      bin
    }


    val binary = asBinary(n)
    val agg = binary.toCharArray.foldLeft((0, 0))((acc, e) => {
      e match {
        case '1' => (acc._1 + 1, acc._2)
        case '0' => if (acc._1 > acc._2) (0, acc._1) else (0, acc._2)
      }
    })

    val result = math.max(agg._1, agg._2)
    println(s"n=$n, asbinary=$binary, result=$result")
    result
  }
}
