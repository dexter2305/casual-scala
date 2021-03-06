package xplore.learnings.hackerrank

import xplore.learnings.BaseFunSuite

class RegExTest extends BaseFunSuite {

  test("naturally sorted"){
    val table = List("riya"-> "riya@gmail.com", "julia"-> "julia@gmail.com")
    assertResult(List("julia", "riya"))(RegEx.applyFilter(table))
  }

  test("naturally sorted + include duplicates"){
    val table = List("riya"-> "riya@gmail.com", "riya"-> "mriya@gmail.com", "julia"-> "julia@gmail.com")
    assertResult(List("julia", "riya", "riya"))(RegEx.applyFilter(table))
  }

  test("only @gmail.com"){
    val table = List("riya"-> "riya@smail.com", "riya"-> "mriya@yaml.com", "julia"-> "julia@gmail.com")
    assertResult(List("julia"))(RegEx.applyFilter(table))
  }

  test("ignore @GMAIL.COM (case sensitive)"){
    val table = List("riya"-> "riya@GMAIL.com")
    assertResult(List.empty)(RegEx.applyFilter(table))
  }
}
