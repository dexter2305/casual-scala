package edu.learnings.concepts

import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class RecursionToList extends FlatSpec with Matchers {

  class SeriesGenerator{

    def generate(startValue: Int, incrementor: Int = 0): LazyList[Int] = {
      LazyList.cons(startValue, generate(startValue + incrementor))
      //startValue #:: generate(startValue + incrementor)
    }

  }


}
