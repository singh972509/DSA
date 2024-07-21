package LinkedList.OneDLinkedList.Medium;


import java.util.Stack;

public class IsPalindrome {
    public static void main(String[] args) {
        ListNode head=convertArrTo2DLL(new int[]{1,2,3,4,5,6});
//        boolean bool= isPalindrome(head);
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
        public boolean isPalindrome1(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }
            Stack<Integer> stack = new Stack<>();
            ListNode temp=head;
            while(temp!=null){
                stack.push(head.data);
                temp=temp.next;
            }
            temp=head;
            while(temp!=null){
                if(stack.peek()!= temp.data){
                    return false;
                }
                stack.pop();
                temp=temp.next;
            }
            return true;
        }

        public static boolean isPalindrome(ListNode head) {
            // if (head == null || head.next == null) {
            //     return true;
            // }
            // Stack<Integer> stack = new Stack<>();
            // ListNode temp=head;
            // while(temp!=null){
            //     stack.push(temp.val);
            //     temp=temp.next;
            // }
            // temp=head;
            // while(temp!=null){
            //     if(stack.peek()!= temp.val){
            //         return false;
            //     }
            //     stack.pop();
            //     temp=temp.next;
            // }
            // return true;
            if(head==null||head.next==null){
                return true;
            }
            ListNode slow=head;
            ListNode fast=head;
            while(fast.next!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            ListNode newHead=reverse(slow.next);
            ListNode temp=head;
            ListNode temp1=newHead;
            while(temp1!=null){
                if(temp.data!=temp1.data){
                    reverse(slow);
                    return false;
                }
                temp=temp.next;
                temp1=temp1.next;
            }
            slow.next=reverse(newHead);
            return true;
        }
        public static ListNode reverse(ListNode head){
        ListNode previous=null;
            while(head!=null){
                ListNode newNode=head.next;
                head.next=previous;
                previous=head;
                head=newNode;
            }
            return previous;
        }
    }

