/* The structure of the Linked list Node is as follows:

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
  // 1 2 4 5 7 9
  // 2
    Node* findIntersection(Node* head1, Node* head2) {
        // code goes here.
        Node* head = new Node(0);
        Node* tail=head;
        while(head1!=NULL && head2!=NULL){
            if(head1->data==head2->data){
                Node* temp = new Node(head1->data);
                tail->next = temp;
                tail = temp;
                head1=head1->next;
                head2=head2->next;
            }else if(head1->data < head2->data){
                head1=head1->next;
            }else if(head1->data > head2->data){
                head2=head2->next;
            }
        }
        return head->next;
    }
};