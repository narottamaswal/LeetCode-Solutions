//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{
public:
    void fun(vector<int> arr, int N,vector<int> &res,int index,int currentSum){
        if(N==index){
            res.push_back(currentSum);
            return;
        }
        fun(arr,N,res,index+1,currentSum+arr[index]);
        fun(arr,N,res,index+1,currentSum);
    }
    vector<int> subsetSums(vector<int> arr, int N)
    {   vector<int> res;
         fun(arr,N,res,0,0);
         return res; 
        // Write Your Code here
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin>>N;
        vector<int> arr(N);
        for(int i = 0 ; i < N ; i++){
            cin >> arr[i];
        }
        Solution ob;
        vector<int> ans = ob.subsetSums(arr,N);
        sort(ans.begin(),ans.end());
        for(auto sum : ans){
            cout<< sum<<" ";
        }
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends