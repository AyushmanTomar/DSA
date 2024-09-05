class Node {
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

public class array2ll {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        Node head = new Node(arr[0]);
        Node temp=head;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            temp.next=node;
            temp=node;
        }
        temp=head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
