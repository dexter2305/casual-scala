package xplore.learnings.random

object CubeCalculator{
  
  def main(args: Array[String]): Unit = {

  }

  def cube(x: Int): Int = x * x * x

  val fcube: Int => Double = (x: Int) => Math.pow(x, 3)
}