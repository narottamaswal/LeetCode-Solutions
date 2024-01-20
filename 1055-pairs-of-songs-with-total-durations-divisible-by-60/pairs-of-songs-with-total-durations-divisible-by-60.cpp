class Solution {
public:
    int numPairsDivisibleBy60(vector<int>& time) {
          unordered_map<int, int> table;
        int res = 0;
        for (int x : time) 
        {
            x %= 60;
            if (table.count(60 - x)) 
                res += table[60 - x];
            else if (x == 0)
                res += table[0];
            table[x]++;
        }
        return res;
    }
};