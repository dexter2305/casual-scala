package xplore.learnings.interviewbit

object LargestNumber {
  def largestNumber(A: Array[Int]): String = {
    val sorted = A.sortWith((a: Int, b: Int) => {
      val x = (a.toString + b.toString).toLong
      val y = (b.toString + a.toString).toLong
      x > y
    })
    val largestNumber = sorted.toList match {
      case Nil => ""
      case _ => sorted.count(e => e == 0) == sorted.length match {
        case true => "0"
        case false => sorted.mkString("")
      }
    }


    //println(s"${largestNumber}")
    largestNumber
  }

}
