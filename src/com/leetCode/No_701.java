package com.leetCode;

//701.Insert into a Binary Search Tree
public class No_701<E extends Comparable<E>> {
    public static void main(String[] args) {


    }



    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    int size;
    TreeNode root;

    public No_701() {
        size = 0;
        root = null;
    }

    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                //size++;
                return new TreeNode(val);
            } else {
                if (val < root.val) {
                    root.left = insertIntoBST(root.left, val);
                }
                if (val > root.val) {
                    root.right = insertIntoBST(root.right, val);
                }
            }
            return root;
        }


    }
}
