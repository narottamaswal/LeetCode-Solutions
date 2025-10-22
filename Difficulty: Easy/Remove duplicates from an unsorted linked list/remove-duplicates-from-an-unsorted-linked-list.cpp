/*
The structure of linked list is the following

struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
};
*/

class Solution {
  public:
    Node *removeDuplicates(Node *head) {
        // your code goes here
        Node* temp=head;
        unordered_map<int,int> mp;
        Node* newHead=NULL;
        Node* tail=NULL;
        while(temp!=NULL){
            if(!mp.count(temp->data)){
                Node* newNode=new Node(temp->data);
                if(newHead==NULL){
                    newHead=tail=newNode;
                }else{
                    tail->next=newNode;
                    tail=newNode;
                }
                mp[temp->data]++;
            }
            temp=temp->next;
        }
        return newHead;
    }
};