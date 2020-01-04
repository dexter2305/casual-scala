package edu.udemy.lectures.basics

import scala.util.matching.Regex

object RegEx {

  def main(args: Array[String]): Unit = {
    println("hasDate(What is 2020-05-23)" + hasDates("What is 2020-05-23"))
    println("isDate(What is 2020-05-23)" + isJustDate("What is 2020-05-23"))
    println(s" ${isJustDate("2020-03-23")}")
    extractDateFirstOccurence("dummy")
    extractAllDates("What is 2020-05-23 &  2020-05-24 & 2020-05-25")
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

  def extractDateFirstOccurence(text: String): Unit = {
    val pattern = datePattern().unanchored
    val pattern(year: String, month: String, date: String) = "this is 2020-12-12 & 2002-02-02"
    println(s"$year $month $date")
  }

  def extractAllDates(text: String): Unit = {
    val pattern = datePattern().unanchored
    pattern.findAllMatchIn(text).foreach(println)
  }

}
