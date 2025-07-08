class Solution {
public:
    string reversePrefix(string word, char ch) {
        int start = 0,n= word.length(), end = n-1;
        bool found=false;
        int elementIndex=-1;
        for(int i=0;i<n;i++){
            if(word[i]==ch){
                found=true;
                elementIndex=i;
                break;
            }
        }
        if(!found) return word;
        for(int i=0, j = elementIndex;i<=elementIndex/2;i++,j--){
            char temp = word[j];
            word[j] = word[i];
            word[i] = temp;
        }
        return word;
    }
};