package edu.udemy.lectures.basics

object ValuesVariablesTypes {

  def main(args: Array[String]): Unit = {
    println("hello, scala")
    val anumber = "a45"
    val number = anumber.toIntOption.getOrElse("invalid")
    println(number)
  }
}
