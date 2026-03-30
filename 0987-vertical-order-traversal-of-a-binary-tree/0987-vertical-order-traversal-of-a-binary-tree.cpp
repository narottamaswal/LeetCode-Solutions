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
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        vector<vector<int>> res;
        map<int,map<int,multiset<int>>> map;
        queue<pair<TreeNode*,pair<int,int>>> q;
        q.push({root,{0,0}});
        while(!q.empty()){
            auto qfront = q.front();
            q.pop();
            int vertical = qfront.second.first;
            int level=qfront.second.second;
            TreeNode* element = qfront.first;
            map[vertical][level].insert(element->val);
            if(element->left){
                q.push({element->left,{vertical-1,level+1}});
            }
            if(element->right){
                q.push({element->right,{vertical+1,level+1}});
            }
        }
        
        for(auto it:map){
            vector<int> temp;
            for(auto q:it.second){
                temp.insert(temp.end(),q.second.begin(),q.second.end());
            }
            res.push_back(temp);
        }
        return res;
    }
};