//CommandExecer
package edu.learnings.random

import scala.sys.process._

object CommandExecer{
  def main(args: Array[String]): Unit = {
    println("hello, execer")
    val currentPath = "ssh -tt  administrator@vminnsh01.eur.ad.sag bash".!!
    println(currentPath)
  }
}