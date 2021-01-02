package edu.learnings.concepts

import edu.learnings.BaseFlatSpec

class RecursionToList extends BaseFlatSpec {

  class SeriesGenerator {

    def generate(startValue: Int, incrementor: Int = 0): LazyList[Int] = {
      LazyList.cons(startValue, generate(startValue + incrementor))
      //startValue #:: generate(startValue + incrementor)
    }

  }


}
