class Solution {
    private void swap(int[] a, int start,int end){
        while(start<end){
            int temp = a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n  = nums.length;
        k = k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
        
    }
}
// 7 6 5 4 3 2 1
// 