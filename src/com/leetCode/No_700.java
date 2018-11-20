package com.leetCode;

//700. Search in a Binary Search Tree
public class No_700 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) return null;
            if (val < root.val) return searchBST(root.left, val);
            else if (val > root.val) return searchBST(root.right, val);
            else return root;
        }
    }


}
