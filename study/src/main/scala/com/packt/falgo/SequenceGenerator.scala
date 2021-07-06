package com.packt.falgo

trait SequenceGenerator {

  def generate(total: Int): List[Int]
  def generateFormatted(total: Int): String = generate(total).mkString(",")

}
