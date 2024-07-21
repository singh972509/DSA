package LinkedList.OneDLinkedList;




class Solution {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Node head=constructLL(arr);
        System.out.println(head.data);
//        Node head1=deleteHeadLL(head);
//        Node head1=deleteTailLL(head);
//        Node head2=deleteKthElement(head,5);
//        Node head1=removeKthElement(head,4);
        Node head2=InsertElementKthPlace(head,8,1);
    }
    static Node constructLL(int arr[]) {
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        // code here
        return head;
    }
    static class Node{
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
    static Node deleteHeadLL(Node head){
        if(head==null){
            return head;
        }
        Node temp=head;
        head=temp.next;
        return head;
    }
    static Node deleteTailLL(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    static Node deleteKthElement(Node head,int key){
        if(head==null || head.next==null){
            return head;
        }
//        Deleting head
        if(key==1){
            Node temp=head;
            head=temp.next;
            return head;
        }
//        Deleting any element
        int count=0;
        Node temp=head;
        Node previous=null;
        while(temp!=null){
            count++;
            if(count==key){
                previous.next=previous.next.next;
                break;
            }
            else{
                previous=temp;
                temp=temp.next;
            }
        }
        return head;
    }
    static Node removeKthElement(Node head,int key){
        if(head==null){
            return head;
        }
        Node temp=head;
        Node previous=null;
        while(temp!=null){
            if(temp.data==key){
                previous.next=previous.next.next;
                break;
            }
            previous=temp;
            temp=temp.next;
        }
        return head;
    }

    static Node InsertElementHead(Node head,int element){
        return new Node(element,head);
    }
    static Node InsertElementTail(Node head,int element){
        Node newNode=new Node(element);
        if(head==null){
            head=newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
    static Node InsertElementKthPlace(Node head,int element,int position){
        if(head==null){
            return new Node(element);
        }
        if(position==1){
            Node newNode=new Node(element,head);
            return newNode;
        }
        Node temp=head;
        int count=0;
        Node previous=null;
        while(temp!=null){
            count++;
            if(count==position){
                Node newNode=new Node(element);
                newNode.next=temp;
                previous.next=newNode;
                temp=temp.next;
                break;
            }
            previous=temp;
            temp=temp.next;
        }
        return head;
    }
}
