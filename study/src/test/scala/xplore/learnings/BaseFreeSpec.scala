package xplore.learnings

import org.scalatest.concurrent.TimeLimitedTests
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.time.{Seconds, Span}

class BaseFreeSpec extends AnyFreeSpec with TimeLimitedTests with Matchers {
  val timeLimit: Span = Span(7, Seconds)
}
