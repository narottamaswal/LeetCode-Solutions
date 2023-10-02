class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
       int start=0;
       int row=matrix.size();
       int col=matrix[0].size();
       int end=row*col-1;
       int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            int colNo=mid%col;
            int rowNo=(mid-colNo)/col;
            if(matrix[rowNo][colNo]==target){
                return true;
            }else if(matrix[rowNo][colNo]>target){
                end=mid-1;
            }else{
               start = mid+1;
            }
        }
       
       return false;
    }
};