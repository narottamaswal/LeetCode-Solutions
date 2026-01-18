class Solution {
public:
    vector<int> maxDepthAfterSplit(string seq) {
        vector<int> ans;
        int depth = 0;
        for (auto ch : seq) {
            if (ch == '(') {
                ans.push_back(depth % 2);
                depth++;
            } else if (ch == ')') {
                depth--;
                ans.push_back(depth % 2);
            }
        }
        return ans;
    }
};