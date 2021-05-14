package edu.learnings.leetcode.binarytree

import edu.learnings.BaseFlatSpec

class MaxDepthOfBinaryTreeSpec extends BaseFlatSpec {
  trait UnboundedNodes {
    val one: TreeNode = TreeNode(1)
    val two: TreeNode = TreeNode(2)
    val three: TreeNode = TreeNode(3)
    val four: TreeNode = TreeNode(4)
    val five: TreeNode = TreeNode(5)
    val six: TreeNode = TreeNode(6)
    val seven: TreeNode = TreeNode(7)
  }

  "Max depth of binary tree " must "be 0 for null root node" in {
    MaxDepthOfBinaryTree.maxDepth(null) shouldBe 0
  }

  it must "be 1 when only root node is given" in {
    MaxDepthOfBinaryTree.maxDepth(TreeNode(1)) shouldBe 1
  }

  it must "be 3 [1,2,3,4,5,6,7]" in new UnboundedNodes {
    one.left = two
    one.right = three
    two.left = four
    two.right = five
    three.left = six
    three.right = seven
    MaxDepthOfBinaryTree.maxDepth(one) shouldBe 3
  }

  it must "handle left heavy tree" in new UnboundedNodes {
    one.left = two
    two.left = three
    three.left = four
    one.right = five
    MaxDepthOfBinaryTree.maxDepth(one) shouldBe 4
  }

}
