package LinkedList.OneDLinkedList.Medium;

import LinkedList.OneDLinkedList.IntroToLinkedList;
import LinkedList.TwoDLL.IntroTo2DLL;

public class MiddleOfLinkedList {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=convertArrTo2DLL(arr);

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

    public Node middleNode(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int mid=0;
        if(count%2==0){
            mid = count / 2 + 1;
        }
        else{
            mid = count / 2 + 1;
        }
        int count1 = 1;
        temp = head;
        while (temp != null) {
            if (count1 == mid) {
                head = temp;
            }
            temp = temp.next;
            count1++;
        }
        return head;
    }
}
