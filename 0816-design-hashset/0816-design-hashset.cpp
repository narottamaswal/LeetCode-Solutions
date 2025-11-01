//object class for creating linked list
class node{
    public:
    int data;
    node*next;
    node(int val)
    {
        data=val;
        next=NULL;
    }
};



class MyHashSet {
public:
    node*head=NULL;//must add this as the public and at this position(out of any function and constructore )
    MyHashSet() {
        head=new node(-1);
        //initialise first node with -1 this will help in further process stay tuned
        
    }
    
    void add(int key) {
        node*n=new node(key);
        
        
        node*temp=head;
        
        while(temp->next!=NULL)
        {
            if(temp->next->data==key)
            {//checking for if that key is exist or not if exist than dont do any thing
                return ;
            }
            temp=temp->next;
        }
      
            
        temp->next=n;
        //adding the node in tail
        return;
        
    }
    
    void remove(int key) {
        if(head->next==NULL) return;
        //check if there is no node exist
       
        
         node * temp=head;
        while(temp->next!=NULL)
        {
            if(temp->next->data==key)//if some node has key value 
            {
                node*d=temp->next;//make that key value node as d
             temp->next=temp->next->next;//pointing previous node to next node of d
             delete d;//delete d
              return ;
            }
            temp=temp->next;
        }
       
        
    }
    
    bool contains(int key) {
        node*temp=head->next;//because we initialized our linkedlist with -1
       while(temp!=NULL)
       {
           if(temp->data==key)
           {
               return 1;
           }
           temp=temp->next;
       }
        return 0;
        
        
        
    }
};