package edu.udemy.lectures.basics

import scala.util.matching.Regex

object RegEx {

  def main(args: Array[String]): Unit = {
    println("hasDate(What is 2020-05-23)" + hasDates("What is 2020-05-23"))
    println("isDate(What is 2020-05-23)" + isJustDate("What is 2020-05-23"))
    println(s" ${isJustDate("2020-03-23")}")
    extractDateFirstOccurrence("dummy")
    extractAllDates("What is 2020-05-23 &  2020-05-24 & 2020-05-25")
    println("isEmpty: " + isEmpty(""))
    println("isEmpty: " + isEmpty("test"))
    println(testMatches("s", """(\w+)""".r))
    println("matches -> " + testMatchSof("12", """(\w+)"""))
    println("relative: " + relative(20))
    print5Matrix()
    printTypeSafeRange1To100()
  }

  def testMatches(input: String, pattern: Regex): Boolean = {
    pattern.matches(input)
  }

  def testMatchSof(input: String, pattern: String): Boolean = {
    pattern.r.matches(input)
  }

  def datePattern(): Regex = {
    val regex = raw"""(\d{4})-(\d{2})-(\d{2})"""
    regex.r
  }

  def isJustDate(input: String): Boolean = {
    datePattern().matches(input)
  }

  def hasDates(input: String): Boolean = {
    datePattern().unanchored.matches(input)
  }

  def extractDateFirstOccurrence(text: String): Unit = {
    val pattern = datePattern().unanchored
    val pattern(year: String, month: String, date: String) = "this is 2020-12-12 & 2002-02-02"
    println(s"$year $month $date")
  }

  def extractAllDates(text: String): Unit = {
    val pattern = datePattern().unanchored
    pattern.findAllMatchIn(text).foreach(println)
  }

  def isEmpty(input: String): String = {
    val nonEmptyStringPattern = raw"""\w+""".r
    input match {
      case nonEmptyStringPattern() => s"matched $input"
      case _ => "n/a"
    }
  }

  def relative(value: Double): String = {
    value match {
      case value if value == 0 => "same"
      case value if value > 0 => "greater"
      case value if value < 0 => "lesser"
    }
  }

  def print5Matrix(): Unit = {
    for (i <- 1 to 100) {
      i % 5 match {
        case 0 => println(i)
        case _ => print(s"$i ,")
      }
    }
  }

  def printTypeSafeRange1To100():Unit = {
    for(i <- 1 to 100){
      i match {
        case i if i % 3 ==0 && i % 5 ==0 => println("typesafe")
        case i if i % 3 ==0 => println("type")
        case i if i % 5 ==0 => println("safe")
        case _ => println(i)
      }
    }
  }
}
