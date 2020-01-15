package edu.learnings

import scala.annotation.tailrec

object Fibonacci {

  def main(args: Array[String]): Unit = {
    println(fib(0))
    println(fib(3)) //1
    println(fib(4)) //2
    println(fibShort(50))
  }

  def fib(n: Int): Int = {
    @scala.annotation.tailrec
    def fibHelper(e1: Int, e2: Int, togo: Int): Int = {
      togo match {
        case 0 => e2
        case _ => fibHelper(e2, e1 + e2, togo - 1)
      }
    }

    n match {
      case 0 => 0
      case 1 => 1
      case _ => fibHelper(0, 1, n + 1 - 2)
    }
  }

  def fibShort(n: Int): Long = {
    @tailrec
    def aux(i: Int, e1: Long, e2: Long): Long = {
      println(s"$i -> ($e1, $e2)")
      i match {
        case 0 => e1 + e2
        case _ => aux(i - 1, e2, e2 + e1)
      }
    }
    aux(n, 0L, 1L)
  }
}
