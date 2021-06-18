package chong.yang.com;

public class ReverseUnidirectionalLinkedList {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);

        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next=listNode2;
        listNode2.next=listNode3;
        ListNode head = ReverseList(listNode1);
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
    }

    public static ListNode ReverseList(ListNode head) {
        if(head==null || head.next ==null)
            return head;
        ListNode last = ReverseList(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
}


 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}