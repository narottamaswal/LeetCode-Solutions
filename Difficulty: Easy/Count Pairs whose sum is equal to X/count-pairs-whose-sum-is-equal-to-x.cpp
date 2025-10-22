/*
Structure of the node of the linked list is as
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
    // your task is to complete this function
    int countPairs(struct Node* head1, struct Node* head2, int x) {
        // Code here
        unordered_map<int,int> mp;
        Node* temp=head1;
        while(temp!=NULL){
            mp[temp->data]++;
            temp=temp->next;
        }
        int c=0;
        temp=head2;
        while(temp!=NULL){
            if(mp.count(x-temp->data)){
                c++;
            }
            temp=temp->next;
        }
        return c;
    }
    
};