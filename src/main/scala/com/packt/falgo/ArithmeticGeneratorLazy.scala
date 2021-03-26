package com.packt.falgo

class ArithmeticGeneratorLazy extends SequenceGenerator {
  override def generate(total: Int): List[Int] = {
    lazy val lz: LazyList[Int] = 1 #:: lz.map(_ + 1)
    lz.take(total).toList
  }
}
