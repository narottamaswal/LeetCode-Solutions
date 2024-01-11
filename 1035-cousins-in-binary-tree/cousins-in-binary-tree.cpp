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
    bool isCousins(TreeNode* root, int x, int y) {
        if(!root) return false;
        int x_depth =0, y_depth=0,x_parent=0,y_parent=0;
        queue<pair<TreeNode*,TreeNode*>> q;
        int depth=0;
        q.push({root,root});
        while(!q.empty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                auto it = q.front();
                TreeNode* node = it.first;
                TreeNode* parent = it.second;
                q.pop();
                if(node->val==x){
                    x_parent=parent->val;
                    x_depth=depth;
                }
                if(node->val==y){
                    y_parent=parent->val;
                    y_depth=depth;
                }
                if(node->left){
                    q.push({node->left,node});
                }
                if(node->right){
                    q.push({node->right,node});
                }
            }
            depth++;
        }
        cout<<x_depth<<" "<<y_depth<<" "<<x_parent<<" "<<y_parent<<endl;
        if(x_depth!=0 && y_depth!=0 && x_depth==y_depth && x_depth>1 && y_depth>1 && x_parent!=y_parent){
            return true;
        }
        return false;
    }
};