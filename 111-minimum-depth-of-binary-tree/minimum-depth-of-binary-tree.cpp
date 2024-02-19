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

    int minDepth(TreeNode* root) {
        // if(root==NULL){
        //     return 0;
        // }
        // int left = minDepth(root->left);
        // int right =minDepth(root->right);
        // if(left==0 || right==0){
        //     return (1 + left + right);
        // }
        // return 1+min(left,right);
        if(root==NULL){
            return 0;
        }
        int ans=1;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty()){
            int size = q.size();
            while(size--){
                TreeNode* topNode = q.front();
                q.pop();
                if(topNode->left==NULL && topNode->right==NULL){
                    return ans;
                }
                if(topNode->left!=NULL){
                    q.push(topNode->left);
                }
                if(topNode->right!=NULL){
                    q.push(topNode->right);
                }
            }
            ans++;  
        }
        return ans;
    }
};