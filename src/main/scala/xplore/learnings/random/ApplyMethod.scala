//ApplyMethod.scala
package xplore.learnings.random

object ApplyMethodMain {
  def main(args: Array[String]): Unit = {
    val rect: Rectangle = Rectangle(10, 12)
    val r = rect(5,5)
    println(rect.toString)
    println(r.toString)
  }
}

case class Rectangle(length: Int, breadth: Int) {

  def area(): Int = {
    length * breadth
  }

  def apply(l: Int, b:Int): Rectangle = {
    println("invoked from the instance apply method. wow")
    new Rectangle(l + length, b + breadth)
  }

}

object Rectangle {

  def apply(length: Int, breadth: Int): Rectangle = {
    println("Creating rectangle (invoked from object class")
    new Rectangle(length, breadth)
  }
}