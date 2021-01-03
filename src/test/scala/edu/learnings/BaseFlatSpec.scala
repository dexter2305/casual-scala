package edu.learnings

import org.scalatest.concurrent.TimeLimitedTests
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.time.{Seconds, Span}


/**
 * Scala recommends using FlatSpec
 *  - often mixed in with traits like
 *    - Matchers
 *    - BeforeAndAfter
 */

class BaseFlatSpec extends AnyFlatSpec with Matchers with TimeLimitedTests {
  val timeLimit: Span = Span(7, Seconds)
}
