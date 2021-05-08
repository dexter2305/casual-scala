package edu.learnings.leetcode.binarytree

import edu.learnings.BaseFlatSpec

class LevelOrderTraversalSpec extends BaseFlatSpec {
  trait UnboundedNodes {
    val one: TreeNode = TreeNode(1)
    val two: TreeNode = TreeNode(2)
    val three: TreeNode = TreeNode(3)
    val four: TreeNode = TreeNode(4)
    val five: TreeNode = TreeNode(5)
    val six: TreeNode = TreeNode(6)
  }

  "Level order traversal" must "traverse root to leaf nodes by levels " in new UnboundedNodes {
    one.left = two
    one.right = three
    two.left = four
    two.right = five
    three.left = six
    LevelOrderTraversal.levelOrder(one) shouldBe List(List(1), List(2,3), List(4,5,6))
  }

  it must "handle null input" in {
    LevelOrderTraversal.levelOrder(null) shouldBe List.empty
  }

}
