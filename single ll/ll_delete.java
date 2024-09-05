import java.util.*;
class Node{
    int data;
    Node next;
    Node()
    {
        data = 0;
        next =null;
    }
    Node(int data,Node next)
    {
        this.data= data;
        this.next=next;

    }
    Node(int data)
    {
        this.data = data;
        this.next=null;
    }
}
public class ll_delete {
    public Node delete_start_node(Node head)
    {
        Node temp = head.next;
        head = temp;
        return head;
    }
    public Node delete_end_node(Node head){
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public Node delete_in_middle(Node head,int data)
    {
        if(head == null)
        {
            return head;
        }
        if(head.data==data)
        {
            head = delete_start_node(head);
            return head;
        }
        Node prev = head;
        Node temp=head.next;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                prev.next=temp.next;
            }
            temp=temp.next;
            prev = prev.next;
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
        Scanner sc = new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,0};
        int ch =1;
        Node head = new Node(arr[0]);
        Node temp=head;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            temp.next=node;
            temp=node;
        }
        ll_delete ob = new ll_delete();
        while(ch!=0)
        {
            ch = sc.nextInt();
            if(ch==0)
            break;
            else if(ch==1)
            {
                head = ob.delete_start_node(head);
                ob.print_ll(head);
            }
            else if(ch==2)
            {
                head = ob.delete_end_node(head);
                ob.print_ll(head);
            }
            else if(ch==3)
            {
                int data = sc.nextInt();
                head = ob.delete_in_middle(head,data);
                ob.print_ll(head);
            }
        }  
    }
}
