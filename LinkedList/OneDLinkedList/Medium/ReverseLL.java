package LinkedList.OneDLinkedList.Medium;

public class ReverseLL {
    public static void main(String[] args) {
    Node head=convertArrTo2DLL(new int[]{1,2,3,4});
    Node head1=reverseList(head);
    }
    public static Node convertArrTo2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverseList(Node head) {
        Node previous=head;
        Node temp=head.next;
        head=head.next;
        while(head!=null){
            head=head.next;
            temp.next=previous;
            previous=temp;
            temp=head;
        }
        head=previous;
        return head;
    }
}
