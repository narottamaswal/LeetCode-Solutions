/*
class Node {
    int data;
    Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

}; */

class Solution {
  public:
    int getMiddle(Node* head) {
        // code here
        int c=0;
        Node* temp=head;
        while(temp!=NULL){
            c++;
            temp=temp->next;
        }
        int m = (c/2)+1;
        temp=head;
        while(m-->1 && temp!=NULL){
            temp=temp->next;
        }
        return temp->data;
    }
};