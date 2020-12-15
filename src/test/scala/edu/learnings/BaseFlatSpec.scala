package edu.learnings

import org.junit.runner.RunWith
import org.scalatest.FlatSpec
import org.scalatestplus.junit.JUnitRunner

/**
 * Scala recommends using FlatSpec
 *  - often mixed in with traits like
 *    - Matchers
 *    - BeforeAndAfter
 */
@RunWith(classOf[JUnitRunner])
class BaseFlatSpec extends FlatSpec
