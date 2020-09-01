package edu.learnings.random

object TemperatureConverter {

  def main(args:Array[String]):Unit = {
    println(ctof(97.3))
    println(ctofi(97.3))
  }
  def ctof(c: Double): Double = 32 + (c * 9 / 5)

  def ctofi(c: Double): Int = (32 + (c * 9/5)).toInt

}
