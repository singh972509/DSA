package LinkedList.OneDLinkedList;

public class IntroToLinkedList {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,8};
//        Node y=new Node(arr[1]);
//        System.out.println(y.data);
        Node head=convertArrTwoLL(arr);
        System.out.println(head.data);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node convertArrTwoLL(int[] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i< arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
}
