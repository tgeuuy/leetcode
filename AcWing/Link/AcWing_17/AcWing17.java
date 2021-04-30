package Link.AcWing_17;


public class AcWing17 {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] res = new int[nums.length];
        ListNode head = creat(nums);
        display(head);
        ListNode head1 = printListReversingly(head);
        display(head1);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(res[i] + " ");
//        }


    }

    /**
     * 倒置无头结点链表
     *
     * @param head
     */
    private static ListNode printListReversingly(ListNode head) {
        if (head == null) return null;
        ListNode pre = null, next = null;
        ListNode node = head;
        while (node.next != null) {
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }


        return pre;


    }

    private static void display(ListNode head) {
        if (head == null) return;
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static ListNode creat(int[] nums) {
        if (nums == null) return null;
        int n = nums.length;
        ListNode head = new ListNode(-1);
        head.next = null;
        for (int num : nums) {
            ListNode p = new ListNode(num);
            p.next = head.next;
            head.next = p;
        }
        return head.next;
    }

}
