package edu.learnings

object StringOps {

  def main(args: Array[String]): Unit = {
    println("validIpPattern:" + validIPPattern("1.2.3.4"))
    println("defangIp:" + defangedIP("1.2.3.4"))
  }

  def repeatedSubstringPattern(s: String): Boolean = {
    val firsthalf = s.substring(0, s.length / 2)
    val secondhalf = s.substring(s.length() / 2, s.length)

    firsthalf equals secondhalf
  }

  def validIPPattern(ip: String): Boolean = {
    val ipPattern = raw"""[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}""".r
    ipPattern.matches(ip)
  }

  def defangedIP(ip: String) : String = {
    ip.replace(".", "[.]")
  }


}
