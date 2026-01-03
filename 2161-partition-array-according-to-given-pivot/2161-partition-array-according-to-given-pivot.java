class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l = nums.length;
        ArrayList<Integer> ad = new ArrayList<>(l);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                ad.add(nums[i]);
            }
        }
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=0;i<l;i++){
            if(nums[i]<pivot){
                al1.add(nums[i]);
            }
        }
        for(int i=0;i<l;i++){
            if(nums[i]>pivot){
                al2.add(nums[i]);
            }
        }
        al1.addAll(ad);
        al1.addAll(al2);
          int[] arr = al1.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return arr;
    }
}