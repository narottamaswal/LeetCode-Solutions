class Solution {
public:
    void reverseString(vector<char>& s) {
        int n = s.size();
        int mid = (n/2)-1;
        int start = 0, end = n-1;
        while(start<=mid && end>=mid){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
};