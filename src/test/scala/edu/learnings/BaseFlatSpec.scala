package edu.learnings

import org.scalatest.{FlatSpec, Matchers}


/**
 * Scala recommends using FlatSpec
 *  - often mixed in with traits like
 *    - Matchers
 *    - BeforeAndAfter
 */

class BaseFlatSpec extends FlatSpec with Matchers
