/*
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    void mir(Node root){
        if(root==null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mir(root.left);
        mir(root.right);
    }
    void mirror(Node root) {
        // code here
        mir(root);
        //root;
        
    }
}