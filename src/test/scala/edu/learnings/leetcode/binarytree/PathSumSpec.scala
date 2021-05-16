package edu.learnings.leetcode.binarytree

import edu.learnings.BaseFlatSpec

class PathSumSpec extends BaseFlatSpec {


  "Path Sum" must "return true for [5,4,8,11,null,13,4,7,2,null,null,null,1] with targetSum as 22" in {
    val store:Map[Int, TreeNode] = List(5, 4, 8, 11, 13, 4, 7, 2, 1).map(e => (e,TreeNode(e))).toMap
    store(5).left = store(4)
    store(5).right = store(8)
    store(4).left = store(11)
    store(11).left = store(7)
    store(11).right = store(2)
    store(8).left = store(13)
    store(8).right = store(4)
    store(4).right = store(1)
    PathSum.hasPathSum (store(5), 22) shouldBe true
  }
  it must "return false for path sum > any branch" in {
    val store: Map[Int, TreeNode] = List(1,2,3).map(e => (e,TreeNode(e))).toMap
    store(1).left = store(2)
    store(1).right = store(3)
    PathSum.hasPathSum(store(1), 100) shouldBe false
  }

  it must "return false for path sum = any branch above the leaf" in {
    val store: Map[Int, TreeNode] = List(1,2,3).map(e => (e,TreeNode(e))).toMap
    store(1).left = store(2)
    store(1).right = store(3)
    PathSum.hasPathSum(store(1), 1) shouldBe false
  }
  it must "return false null root node" in (PathSum.hasPathSum(null, 100) shouldBe false)
  it must "return true root (only node) eq target sum" in (PathSum.hasPathSum(TreeNode(100), 100) shouldBe true)
}
