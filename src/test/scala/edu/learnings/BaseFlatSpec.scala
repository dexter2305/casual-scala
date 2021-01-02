package edu.learnings

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers


/**
 * Scala recommends using FlatSpec
 *  - often mixed in with traits like
 *    - Matchers
 *    - BeforeAndAfter
 */

class BaseFlatSpec extends AnyFlatSpec with Matchers
