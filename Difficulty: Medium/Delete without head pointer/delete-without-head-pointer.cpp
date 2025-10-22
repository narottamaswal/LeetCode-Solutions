/*
struct Node {
  int data;
  struct Node *next;
  Node(int x) {
    data = x;
    next = NULL;
  }
}*head;
*/

class Solution {
  public:
    void deleteNode(Node* del_node) {
        // Move the data first and then change the pointer
        Node* temp = del_node->next;
        del_node->data=temp->data;
        del_node->next=temp->next;
        delete temp;
    }
};