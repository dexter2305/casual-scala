package edu.learnings.concepts

import org.scalatest.concurrent.TimeLimitedTests
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.time.{Millis, Span}


class TimeControlledTests extends AnyFlatSpec with TimeLimitedTests {
  /**
   * max execution time for a test
   * */
  val timeLimit: Span = Span(200, Millis)


  "TimeControlledTests" should "pass if it completes within the time limit" in {
    Thread.sleep(100)
  }

  it should "fail if it exceeds the limit" in {
    Thread.sleep(500)
  }
}

