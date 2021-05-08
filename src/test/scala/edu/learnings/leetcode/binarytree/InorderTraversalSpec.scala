package edu.learnings.leetcode.binarytree

import edu.learnings.BaseFlatSpec

class InorderTraversalSpec extends BaseFlatSpec {

  trait UnboundedNodes {
    val one: TreeNode = TreeNode(1)
    val two: TreeNode = TreeNode(2)
    val three: TreeNode = TreeNode(3)
    val four: TreeNode = TreeNode(4)
    val five: TreeNode = TreeNode(5)
    val six: TreeNode = TreeNode(6)
  }

  "In order traversal" must "return (left, head, right)" in new UnboundedNodes {
    one.left = two
    one.right = three
    InOrderTraversal.inorderTraversal(one) shouldBe List(2, 1, 3)
  }
  it must "handle when left tree does not exist" in new UnboundedNodes {
    one.right = two
    two.right = three
    InOrderTraversal.inOrderTraversalRecursion(one) shouldBe List(1,2,3)
  }
  it must "return empty for null root" in {
    InOrderTraversal.inorderTraversal(null) shouldBe List.empty[Int]
  }

}
