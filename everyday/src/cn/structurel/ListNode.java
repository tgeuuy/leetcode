package cn.structurel;

public class ListNode {
    public  int val;
    public  ListNode next;

    public  void ListNode(int val) {
        this.val = val;
    }

    public  void ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
