/* structure of list node:

struct Node
{
    int data;
    Node *next;
    Node(int val)
    {
        data=val;
        next=NULL;
    }
};

*/

class Solution {
  public:
    Node* findIntersection(Node* head1, Node* head2) {
        // code here
        unordered_map<int,int> mp;
        Node* temp=head2;
        while(temp!=NULL){
            mp[temp->data]++;
            temp=temp->next;
        }
        temp=head1;
        Node* newList=new Node(0);
        Node* tail =newList;
        while(temp!=NULL){
            if(mp[temp->data]>0){
                Node* newNode = new Node(temp->data);
                tail->next=newNode;
                tail=newNode;
            }
            temp=temp->next;
        }
        return newList->next;
    }
};