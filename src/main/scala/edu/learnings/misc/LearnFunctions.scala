//Functions.scala
package edu.learnings;
object LearnFunctions{
  def main(args: Array[String]): Unit = {
    var s: String = null; 
    println(welcomeMessage(s))

    println(areaOfCircle(1))

  }

  val welcomeMessage = (s: String) => {
    if (s == null || s.isEmpty) { "Hello" }
    else {"Hello, " + s}
  } : String

  val areaOfCircle = (radius: Int) => { Math.pow(radius, 2) * 22 / 7}

  val areaOfRectangle = (length: Int, breadth: Int) => { length * breadth }

}