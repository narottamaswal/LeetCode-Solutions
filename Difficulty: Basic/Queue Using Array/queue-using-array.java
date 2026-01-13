class myQueue {
    private int[] arr;
    private int size;
    private int currentSize;
    private int front,back;
    
    // Constructor
    public myQueue(int n) {
        this.size = n;
        this.arr = new int[this.size];
        this.currentSize=0;
        this.front=-1;
        this.back=-1;
        // Define Data Structures
    }

    public boolean isEmpty() {
        return this.currentSize==0;
        // Check if queue is empty
    }

    public boolean isFull() {
        return this.currentSize==this.size;
        // Check if queue is full
    }

    public void enqueue(int x) {
        // Enqueue
        if(!this.isFull()){
            if(this.front==-1){
                front=0;
            }
            this.back++;
            this.arr[this.back]=x;
            this.currentSize++;
        }
    }

    public void dequeue() {
        if(!this.isEmpty()){
            front++;
            this.currentSize--;
            if(this.currentSize==0){
                this.front=-1;
                this.back=-1;
            }
        }
        // Dequeue
    }

    public int getFront() {
        // Get front element
        if(!this.isEmpty()){
            return this.arr[front];
        }
        return -1;
    }

    public int getRear() {
        // Get last element
        if(!this.isEmpty()){
            return this.arr[back];
        }
        return -1;
    }
}
