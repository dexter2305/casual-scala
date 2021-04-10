package edu.learnings

import org.scalatest.concurrent.TimeLimitedTests
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.time.{Seconds, Span}

class BaseFunSpec extends AnyFunSpec with Matchers with TimeLimitedTests {
  override def timeLimit: Span = Span(7, Seconds)
}