// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
class Node{
    public:
    int data;
    Node* next;
    public:
        Node(int data1,Node* next2)
        {
            data = data1;
            next = next2;
        }
        Node(int data1)
        {
            data=data1;
            next = nullptr;
        }
};

int main() {
    int data = 10;
    int data2 = 20;
    int *ptr = &data2;
    Node *second = new Node(data2,nullptr);
    Node *head = new Node(data,second);
    cout<<head->next->data;
    return 0;
}