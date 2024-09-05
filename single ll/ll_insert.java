import java.util.*;

class Node
{
    int data;
    Node next;
    Node(int data, Node next)
    {
        this.data = data ;
        this.next = next;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
    Node()
    {
        this.data = 0;
        this.next = null;
    }
}
public class ll_insert {
    static Scanner sc = new Scanner(System.in);
    public Node insert_start(Node head)
    {
        int data = sc.nextInt();
        Node node = new Node(data,head);
        head = node;
        return head;
    }
    public Node insert_end(Node head)
    {
        int data = sc.nextInt();
        Node temp=head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        Node node = new Node(data);
        temp.next=node;
        return head;
    }
    public Node insert_in_between(Node head,int data)
    {
        Node temp = head;
        int d = sc.nextInt();
        while(temp.data!=data)
        {
            temp = temp.next;
        }
        if(temp!=null)
        {
            Node node = new Node(d,temp.next);
            temp.next=node;
        }
        return head;
    }
    public void  print_ll(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int ch =1;
        Node head = new Node(arr[0]);
        Node temp=head;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            temp.next=node;
            temp=node;
        }
        ll_insert ob = new ll_insert();
        while(ch!=0)
        {
            ch = sc.nextInt();
            if(ch==0)
            break;
            else if(ch==1)
            {
                head = ob.insert_start(head);
                ob.print_ll(head);
            }
            else if(ch==2)
            {
                head = ob.insert_end(head);
                ob.print_ll(head);
            }
            else if(ch==3)
            {
                int data = sc.nextInt();
                head = ob.insert_in_between(head,data);
                ob.print_ll(head);
            }
        }  
    }
    
}
