package com.packt.falgo

object Launcher extends App {

  val randomGenerator = new RandomGenerator
  println(s"${randomGenerator.generateFormatted(10)}")

}
