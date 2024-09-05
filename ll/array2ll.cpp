#include<iostream>
using namespace std;
class Node{
    public:
        int data;
        Node * next;
    public:
        Node(int data1,Node* next1)
        {
            data=data1;
            next=next1;
        }
        Node(int data1)
        {
            data= data1;
            next = nullptr;
        }
};
int main()
{
    //converting array to linked list
    
    int arr[] = {1,2,4,5,6,7,6,5};
    int length = sizeof(arr) / sizeof(arr[0]);
    Node *temp=nullptr;
    Node *head;
    for(int i =0;i<length;i++)
    {
        if(i==0)
        {
            head = new Node(arr[i]);
            temp=head;
        }
        else
        {
            Node *node = new Node(arr[i],temp);
            temp=node;
        }
    }
    while (temp->next!=nullptr)
    {
        cout<<temp->data;
        temp=temp->next;
    }
    return 0;
}