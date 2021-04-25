package edu.learnings.leetcode.linkedlists

case class Node(_value: Int) {
  var value: Int = _value
  var prev: Node = null
  var next: Node = null
  var child: Node = null
}
