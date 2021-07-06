package com.packt.falgo

object Launcher extends App {

  val randomGenerator = new RandomGenerator(90)
  println(s"${randomGenerator.generateFormatted(10)}")

}
