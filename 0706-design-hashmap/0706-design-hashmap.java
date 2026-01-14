class MyHashMap {
    private int[] storage;
    private boolean[] oc;
    public MyHashMap() {
        storage = new int[1_000_001];
        oc = new boolean[1_000_001];
    }
    
    public void put(int key, int value) {
        storage[key]=value;
        oc[key]=true;
    }
    
    public int get(int key) {
        if(oc[key]==false){
            return -1;
        }
        return storage[key];
    }
    
    public void remove(int key) {
        oc[key]=false;
        storage[key]=-1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */