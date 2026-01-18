class Solution {
public:

 // 5
 // 0 1 2 3 4 5 6 7 8
    int minimumRefill(vector<int>& plants, int capacityA, int capacityB) {
        int n = plants.size();
        int start = 0, end = n-1;
        int i =0;
        int ans=0;
        int c1=capacityA, c2=capacityB;
        int ind=-1;
        if(n%2==1){
            ind = ((n-1)/2);
        }
        if(n==1){
            return plants[0]/capacityA;
        }
        while(start<=end){
            if(ind!=-1 && start==end){
                cout<<c1<<" "<<c2<< " "<<plants[ind];
                if(c1>=c2){
                    if(c1>=plants[ind]){
                       c1-=plants[ind];
                    }else{
                        ans++;  
                    }  
                }else{
                    if(c2>=plants[end]){
                        c2-=plants[end];
                    }else{
                        ans++;  
                    }  
                }
                break;
            }
            if(plants[start]<=c1){
                c1-=plants[start];
            }else{
                c1=capacityA;
                c1-=plants[start];
                ans++;
            }
            if(plants[end]<=c2){
                c2-=plants[end];
            }else{
                c2=capacityB;
                c2-=plants[end];
                ans++;
            }
            start++;
            end--;
        }
        return ans;
    }
};

/*

    3 , 4



5 4 4 5 4

*/

// a = 6, b = 5
// 0 2 4 4 0
// 0 0 4 1 0
// 