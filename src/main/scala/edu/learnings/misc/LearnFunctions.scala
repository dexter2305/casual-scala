//Functions.scala
package edu.learnings

;

object LearnFunctions {
  def main(args: Array[String]): Unit = {

  }


  val nonZeroDiff: (Int, Int) => Option[Int] = (x: Int, y: Int) => {
    x - y match {
      case 0 => None
      case diff:Int => Some(diff)
    }

  }

}