package LinkedList.OneDLinkedList.Medium;

import LinkedList.TwoDLL.IntroTo2DLL;

import java.util.HashMap;

public class ListCycle {
    public static void main(String[] args) {

    }
    public static class Node {
        int data;
        IntroTo2DLL.Node next;
        IntroTo2DLL.Node back;

        Node(int data, IntroTo2DLL.Node next, IntroTo2DLL.Node prev) {
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
    public boolean hasCycle(Node head) {
        if(head==null || head.next==null){
            return false;
        }
        HashMap<Node,Integer> hashMap=new HashMap<>();
        Node temp=head;
        while(temp!=null){
            if(hashMap.containsKey(temp)){
                return false;
            }
            else{
                hashMap.put(temp,1);
            }
//            temp=temp.next;
        }
        return true;
    }
}
