package LinkedList.OneDLinkedList.Medium;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLL {
    public static void main(String[] args) {
        ListNode head=convertArrTo2DLL(new int[]{1,2,3,4,5,6});
//        boolean bool= isPalindrome(head);
        ListNode head1=oddEvenList(head);
    }

    public static ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        List<Integer> list=new ArrayList<>();
        while(temp!=null && temp.next!=null){
            list.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null){
            list.add(temp.data);
        }
        temp=head.next;
        while(temp!=null&& temp.next!=null){
            list.add(temp.data);
            temp=temp.next.next;
        }
        if(temp!=null){
            list.add(temp.data);
        }
        int counter=0;
        temp=head;
        while(temp!=null){
            if(list.get(counter)!=temp.data){
                temp.data=list.get(counter);
            }
            counter++;
            temp=temp.next;
        }
        return head;
    }

    public static ListNode convertArrTo2DLL(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            ListNode temp = new ListNode(arr[i], null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static class ListNode {
        int data;
        ListNode next;

        ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }
        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static ListNode oddEvenList1(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode even=head.next;
        ListNode odd=head;
        ListNode evenHead=even;
        while(even!=null&&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }
}
