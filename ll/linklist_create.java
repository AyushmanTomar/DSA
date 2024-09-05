import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }
    Node(int data)
    {
        this.data= data;
        this.next= null;
    }
}
class linklist_create{
    public static void main(String[] args) {
        Node head = new Node(10);
        System.out.println(head.data);
        
    }
}