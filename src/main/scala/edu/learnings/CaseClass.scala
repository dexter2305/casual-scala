//CaseClass.scala
package edu.learnings

/**
 * case class
 */
case class Car(brand: String, year: Int)

/**
 * Regular class
 */
class Bike(brand: String, year: Int)

object CaseClassMain {
  def main(args: Array[String]): Unit = {
    val audi = Car("audi", 2020)
    val r15 = new Bike("Yamaha", 2019)
    println(audi)
    println(r15)
  }
}