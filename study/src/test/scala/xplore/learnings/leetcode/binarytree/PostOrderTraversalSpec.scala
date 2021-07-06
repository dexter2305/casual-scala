package xplore.learnings.leetcode.binarytree

import xplore.learnings.BaseFlatSpec

class PostOrderTraversalSpec extends BaseFlatSpec {

  trait UnboundedNodes {
    val one: TreeNode = TreeNode(1)
    val two: TreeNode = TreeNode(2)
    val three: TreeNode = TreeNode(3)
    val four: TreeNode = TreeNode(4)
    val five: TreeNode = TreeNode(5)
    val six: TreeNode = TreeNode(6)
  }

  "Post order traversal" should "return l + r + h for any binary tree" in new UnboundedNodes {
    one.left = two
    one.right = three
    PostOrderTraversal.postorderTraversal(one) shouldBe List(2,3,1)
  }

  it should "return r + h when there is no left node" in new UnboundedNodes {
    one.right = two
    two.right = three
    two.left = four
    PostOrderTraversal.postorderTraversal(one) shouldBe List(4,3,2,1)
  }
}
