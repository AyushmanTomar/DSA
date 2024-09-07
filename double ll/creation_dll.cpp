#include<iostream>
using namespace std;
class Node
{
    public:
        int data;
        Node *next;
        Node *prev;
        Node(int data1, Node *next1, Node *prev1)
        {
            data = data1;
            next = next1;
            prev = prev1;
        }
        Node(int data1,Node *next1)
        {
            data = data1;
            next = next1;
            prev = nullptr;
        }
        Node(int data1)
        {
            data = data1;
            next = nullptr;
            prev = nullptr;
        }
};
int main()
{
    Node *node = new Node(5);
    return 0;
}