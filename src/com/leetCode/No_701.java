package com.leetCode;

//701.Insert into a Binary Search Tree
public class No_701 {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        int[] nums = {62,31,22,46,17,53,42};
        for (int i = 0; i < nums.length; i++) {
            bst.insertIntoBST(nums[i]);
        }
        bst.preOrder();
    }

     static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    static class BST<E extends Comparable<E>> {
        int size;
        TreeNode root;

        public BST() {
            size = 0;
            root = null;
        }

        public void preOrder() {
            preOrder(root);
        }

        private void preOrder(TreeNode node) {
            if (node != null) {
                System.out.println(node.val);
                preOrder(node.left);
                preOrder(node.right);
            }
        }

        public void insertIntoBST(int val) {
            root = insertIntoBST(root, val);
        }

        private TreeNode insertIntoBST(TreeNode root, int val) {
                if (root == null) {
                    size++;
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
