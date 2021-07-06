package com.packt.falgo

import scala.util.Random

class RandomGenerator(seed: Int) extends SequenceGenerator {
  override def generate(total: Int): List[Int] = {
    val r: Random = scala.util.Random
    LazyList.iterate(r.nextInt(seed))( _ => r.nextInt(seed)).take(total).toList
  }
}
