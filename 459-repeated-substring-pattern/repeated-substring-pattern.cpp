class Solution {
public:
    bool repeatedSubstringPattern(string str) {
        return (str + str).substr(1, str.length() * 2 - 2).find(str)!=-1;
    }
};
//abababab