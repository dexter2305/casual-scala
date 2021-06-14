package xplore.learnings.leetcode.binarytree

import xplore.learnings.BaseFlatSpec

class PreOrderTraversalSpec extends BaseFlatSpec {

  trait UnboundedNodes {
    val one: TreeNode = TreeNode(1)
    val two: TreeNode = TreeNode(2)
    val three: TreeNode = TreeNode(3)
    val four: TreeNode = TreeNode(4)
    val five: TreeNode = TreeNode(5)
    val six: TreeNode = TreeNode(6)
    val seven: TreeNode = TreeNode(7)
  }
  "PreOrderTraversal with recursion" should "return [1,2,3] for [1, null, 2, 3]" in new UnboundedNodes {
    one.right = two
    two.left = three
    PreOrderTraversal.preOrderTraversalRecursion(one) shouldBe List(1, 2, 3)
  }
  it must "return [] for null root" in {
    PreOrderTraversal.preOrderTraversalRecursion(null) shouldBe List.empty
  }
  it must "return [1,2] for [1,2] (null right node)" in new UnboundedNodes {
    one.left = two
    PreOrderTraversal.preOrderTraversalRecursion(one) shouldBe List(1,2)
  }
  it must "return [1,2] for [1, null, 2]" in new UnboundedNodes {
    one.right = two
    PreOrderTraversal.preOrderTraversalRecursion(one) shouldBe List(1,2)
  }
  it must "return [1,2,4,5,3,6] for [1,2,3,4,5,null,6]" in new UnboundedNodes {
    one.left = two
    one.right = three
    two.left = four
    two.right = five
    three.right = six
    PreOrderTraversal.preOrderTraversalRecursion(one) shouldBe List(1,2,4,5,3,6)
  }
  it must "return [1,2,4,5,3,6] for [1,2,3,4,5,7,6]" in new UnboundedNodes {
    one.left = two
    one.right = three
    two.left = four
    two.right = five
    three.left = seven
    three.right = six
    PreOrderTraversal.preOrderTraversalRecursion(one) shouldBe List(1,2,4,5,3,7,6)
  }

  "PreOrderTraversal iteration" should "return [1,2,3] for [1, null, 2, 3]" in new UnboundedNodes {
    one.right = two
    two.left = three
    PreOrderTraversal.preOrderTraversalIterative(one) shouldBe List(1, 2, 3)
  }
  it must "return [] for null root" in {
    PreOrderTraversal.preOrderTraversalIterative(null) shouldBe List.empty
  }
  it must "return [1,2] for [1,2] (null right node)" in new UnboundedNodes {
    one.left = two
    PreOrderTraversal.preOrderTraversalIterative(one) shouldBe List(1,2)
  }
  it must "return [1,2] for [1, null, 2]" in new UnboundedNodes {
    one.right = two
    PreOrderTraversal.preOrderTraversalIterative(one) shouldBe List(1,2)
  }
  it must "return [1,2,4,5,3,6] for [1,2,3,4,5,null,6]" in new UnboundedNodes {
    one.left = two
    one.right = three
    two.left = four
    two.right = five
    three.right = six
    PreOrderTraversal.preOrderTraversalIterative(one) shouldBe List(1,2,4,5,3,6)
  }

}
