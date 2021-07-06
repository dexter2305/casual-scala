package xplore.learnings.random

/**
 *  Regular class & object
 */

object Clock {
  val name = "Companions"

}

class Clock(name: String = Clock.name)

object Main {

  def main(args: Array[String]): Unit = {
    val myclock = new Clock
    println(myclock)
  }
}