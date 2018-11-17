package com.leetCode;

//237. Delete Node in a Linked List
//official problem has a big error
//giving the local class for ListNode
public class No_237 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1,8};
        ListNode node = new ListNode(arr,3);
        System.out.println(node);
        new Solution().deleteNode(node);
        System.out.println(node);
    }


    static class Solution {
        public void deleteNode(ListNode node) {
            ListNode dummyNode = new ListNode(-1);
            dummyNode.next = node;
            ListNode prev = dummyNode;
            while (prev.next != null) {
                if (prev.next.val == node.num) {
                    prev.next = prev.next.next;
                } else prev = prev.next;
            }
        }
    }


    static class ListNode {
        int val;
        ListNode next;
        int num;

        ListNode(int x) {
            val = x;
        }

        ListNode(int[] arr, int num) {
            if (arr == null ||arr.length == 0)
                throw new IllegalArgumentException("Failed, arr is empty");
            val = arr[0];
            this.num = num;
            ListNode cur = this;
            for (int i = 1; i < arr.length; i++) {
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ListNode： ");
            for (ListNode cur = this; cur != null; cur = cur.next) {
                sb.append(cur.val + "->");
            }
            sb.append("Null");
            return sb.toString();
        }
    }

}
