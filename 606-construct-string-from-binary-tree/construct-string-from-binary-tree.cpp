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
    void getAns(TreeNode* node,string &ans){
        if(node==NULL){
            return;
        }
        ans.append("(");
        ans.append(to_string(node->val));
        if(node->left==NULL && node->right!=NULL) ans+="()";
        getAns(node->left,ans);
        getAns(node->right,ans);
        ans.append(")");
    }
    string tree2str(TreeNode* root) {
        string ans;
        TreeNode* node=root;
        getAns(node,ans);
        return ans.substr(1,ans.size()-2);
    }
};