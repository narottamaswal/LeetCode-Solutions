class Node {
  public:
    int data;
    Node* next;

    Node(int new_data) {
        data = new_data;
        next = nullptr;
    }
};

class myQueue {

  public:
    Node* head;
    Node* tail;
    int sizeC;
    myQueue() {
        sizeC=0;
        head=tail=nullptr;
        // Initialize your data members
    }

    bool isEmpty() {
        return head==nullptr;
        // check if the queue is empty
    }

    void enqueue(int x) {
        Node* newNode = new Node(x);
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail->next=newNode;
            tail=newNode;
        }
        sizeC++;
        // Adds an element x at the rear of the queue
    }

  
    void dequeue() {
        Node* temp =head;
        int val = temp->data;
        head = head->next;
        if(head==nullptr){
            tail=nullptr;
        }
        delete temp;
        sizeC--;
    }

    int getFront() {
        if(isEmpty()){
            return -1;
        }
        return head->data;
        // Returns the front element of the queue
        // If queue is empty, return -1
    }

    int size() {
        return sizeC;
        // Returns the current size of the queue.
    }
};
