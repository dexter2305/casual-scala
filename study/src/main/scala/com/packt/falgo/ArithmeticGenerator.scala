package com.packt.falgo

class ArithmeticGenerator(start: Int, diff: Int) extends SequenceGenerator {

  /*
    either n2 = n1 + diff
    or n = a + nd

   */
  override def generate(total: Int): List[Int] = {
    Iterator.iterate(start)(n => {
      val x  = n + diff
      println(s"$x")
      x
    }).take(total).toList
  }
}

