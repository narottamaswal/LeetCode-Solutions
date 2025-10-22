/*
struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
};
*/

// Function to insert a node in the middle of the linked list.
class Solution {
  public:
    Node *insertInMiddle(Node *head, int x) {
        Node* newNode = new Node(x);
        if(head==NULL){
            return newNode;
        }
        int count=0;
        Node* temp=head;
        Node* temp2=head;
        while(temp!=NULL){
            count++;
            temp=temp->next;
        }
        int mid = count%2==0 ? count/2 : (count/2)+1;
        temp = head;
        while(mid-- > 1){
            temp = temp->next;
        }
        newNode->next=temp->next;
        temp->next=newNode;
        return head;
    }
};