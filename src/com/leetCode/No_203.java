package com.leetCode;

//203. Remove Linked List Elements
public class No_203 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,4,2};
        ListNode node = new ListNode(arr);
        System.out.println(node);
        System.out.println((new Solution()).removeElements(node,3));
    }

    static class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }

          ListNode(int[] arr) {
              if (arr == null || arr.length == 0) {
                  throw new IllegalArgumentException("Failed, arr is empty");
              }
              val = arr[0];
              ListNode cur = this;
              for (int i = 1; i < arr.length; i++) {
                  cur.next = new ListNode(arr[i]);
                  cur = cur.next;
              }
          }

          public String toString() {
              StringBuilder sb = new StringBuilder();
              sb.append("List: ");
              for (ListNode cur = this; cur != null; cur = cur.next) {
                  sb.append(cur.val + "->");
              }
              sb.append("Null");
              return sb.toString();
          }
    }

    static class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummyNode = new ListNode(-1);
            dummyNode.next = head;
            ListNode prev = dummyNode;
            while (prev.next != null) {
                if (prev.next.val == val) {
                    prev.next = prev.next.next;
                } else prev = prev.next;
            }
            return dummyNode.next;
        }
    }
}
