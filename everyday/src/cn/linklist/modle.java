package cn.linklist;


import cn.linklist.leet_19.Solution;

public class modle {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int v) {
            this.val = v;
        }
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(6);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;


        disPaly(head);
    }

    public static void disPaly(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

}
