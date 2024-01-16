class Solution {
public:
    string originalDigits(string s) {
        unordered_map<int,int> mapp;
        for(char c:s){
            mapp[c]++;
        }
        vector<int> v(10,0);
        v[0]=mapp['z'];
        v[2]=mapp['w'];
        v[4]=mapp['u'];
        v[6]=mapp['x'];
        v[8]=mapp['g'];

        v[1]=mapp['o']-v[0]-v[2]-v[4];
        v[3]=mapp['r']-v[4]-v[0];
        v[5]=mapp['f']-v[4];
        v[7]=mapp['s']-v[6];
        v[9]=mapp['i']-v[8]-v[6]-v[5];

        string ans="";
        for(int i=0;i<10;i++){
            while(v[i]--){
                ans=ans+to_string(i);
            }
        }
        return ans;
    }
};