public class Node{
    String url;
    Node prev;
    Node next;
    public Node(String url){
        this.url = url;
    }
}
class BrowserHistory {
    private Node currentNode;
    public BrowserHistory(String homepage) {
        Node home = new Node(homepage);
        home.prev = null;
        home.next = null;
        this.currentNode = home;
    }
    
    public void visit(String url) {
        Node new1 = new Node(url);
        currentNode.next =new1;
        new1.prev = currentNode;
        currentNode = currentNode.next;
    }
    
    public String back(int steps) {
        while(steps-- >0 && currentNode.prev!=null){
            currentNode = currentNode.prev;
        }
        return currentNode.url;
    }
    
    public String forward(int steps) {
        while(steps-- >0 && currentNode.next!=null){
            currentNode = currentNode.next;
        }
        return currentNode.url;
        
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */