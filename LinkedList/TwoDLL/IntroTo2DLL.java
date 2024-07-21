package LinkedList.TwoDLL;

import LinkedList.OneDLinkedList.IntroToLinkedList;

import java.util.Stack;

public class IntroTo2DLL {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = convertArrTo2DLL(arr);
//        Node head1=deleteHeadOf2DLL(head);
//        Node head2=deleteTailof2DLL((head));
//          Node head3=deleteKthElementOf2DLL(head,5);
//        Node head4 = deleteGiveNode(head.next);
        Node head2=reverse2DLL(head);
    }

    public static class Node {
        int data;
        Node next;
        Node back;

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.back = prev;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
            this.back = null;
        }
    }

    public static Node convertArrTo2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    public static Node deleteHeadOf2DLL(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node previous = head;
        Node temp = head;
        temp = temp.next;
        head = head.next;
        head.back = null;
        head = temp;
        return head;
    }

    public static Node deleteTailof2DLL(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return head;
    }

    public static Node deleteKthElementOf2DLL(Node head, int key) {
        Node temp = head;
        int count = 0;
        if (head == null) {
            return null;
        }
        while (temp != null) {
            count++;
            if (count == key) break;
            temp = temp.next;
        }
        Node previous = temp.back;
        Node front = temp.next;
        if (previous == null && front == null) {
            return null;
        } else if (previous == null) {
            head = head.next;
            head.back = null;
        } else if (front == null) {
            previous.next = null;
        } else {
            previous.next = front;
            front.back = previous;
        }
        return head;
    }

    //    public static Node deleteGiveNode(Node temp){
//       Node temp=head;
//       Node previous=head;
//       Node front=head;
//       if(head==null){
//           return null;
//       }
//       while(temp!=null||temp==element){
//           previous=temp;
//           temp=temp.next;
//           front=temp.next;
//       }
//       if(temp==element){
//           previous.next=front;
//           front.back=previous;
//       }
//        return head;
//    }
    public static Node insertionBeforeHead(Node head, int element) {
            Node temp = new Node(element, head, null);
            head.back=temp;
        return head;
    }
    public static Node insertBeforeTail(Node head,int element){
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node prev=tail.back;
        Node newNode=new Node(element,prev,tail);
        prev.next=newNode;
        tail.back=newNode;
        return head;
    }
    public static Node insertAtKthPosition(Node head,int element,int position){
        Node newNode=new Node(element);
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            if(count==position){
                break;
            }
            temp=temp.next;
        }
        Node previous=temp.back;
        Node front=temp.next;
        if(previous==null&&front==null){
            newNode.next=head;
            head.back=newNode;
        }
        else if(front==null){
            newNode.next=temp;
            newNode.back=previous;
            temp.back=newNode;
        }
        else{
            newNode.next=temp;
            newNode.back=previous;
            previous.next=newNode;
            temp.back=newNode;
        }
        return head;
    }
    public static Node reverse2DLL(Node head){
        Node temp=head;
        Stack<Integer> st=new Stack<>();
        while(temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while(temp!=null){
            temp.data=st.peek();
            st.pop();
            temp=temp.next;
        }
        return head;
    }
    public static Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node previous=null;
        Node current=head;
        while(current!=null){
            previous=current.back;
            current.back=current.next;
            current.next=previous;
            current=current.back;
        }
        return previous;
    }
}