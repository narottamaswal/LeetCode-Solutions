/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void getLeafNodes(TreeNode* node,vector<int> &leafNodes){
        if(node==NULL) return;
        if(node->left)getLeafNodes(node->left,leafNodes);
        if(node->right)getLeafNodes(node->right,leafNodes);
        if(!node->left && !node->right) leafNodes.push_back(node->val);
    }
    bool leafSimilar(TreeNode* root1, TreeNode* root2) {
        vector<int> leafNodes1,leafNodes2;
        getLeafNodes(root1,leafNodes1);
        getLeafNodes(root2,leafNodes2);
        if(leafNodes1.size()!=leafNodes2.size())return false;
        
        for(int i=0;i<leafNodes2.size();i++){
            if(leafNodes1[i]!=leafNodes2[i]){
                return false;
            }
        }
        return true;
    }
};