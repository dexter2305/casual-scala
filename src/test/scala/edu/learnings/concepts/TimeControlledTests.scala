package edu.learnings.concepts

import org.scalatest.concurrent.TimeLimitedTests
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.time.{Millis, Span}


class TimeControlledTests extends AnyFlatSpec with TimeLimitedTests {
  /**
   * max execution time for a test
   * */
  val timeLimit: Span = Span(500, Millis)


  "TimeControlledTests" should "pass if it completes within the time limit" in {
    Thread.sleep(100)
  }

  /**
   * Below test would fail as it exceeds the allotted time limit, intentionally.
   * Test is marked ignore to save the build from failure. Test is retained for learning/reference.
   */
  ignore should "fail if it exceeds the limit" in {
    Thread.sleep(800)
  }
}

