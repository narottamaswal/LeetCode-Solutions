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
    int subtreeSum(TreeNode* node,int low,int high,vector<int> &ans){
        if(!node){
            return 0;
        }
        if(node->val>=low && node->val<=high){
            ans[0]=ans[0]+node->val;
        }
        subtreeSum(node->left,low,high,ans);
        subtreeSum(node->right,low,high,ans);
        return 0;
    }
    int rangeSumBST(TreeNode* root, int low, int high) {
        vector<int> ans;
        ans.push_back(0);
        TreeNode* node=root;
        subtreeSum(node,low,high,ans);
        return ans[0];
    }
};