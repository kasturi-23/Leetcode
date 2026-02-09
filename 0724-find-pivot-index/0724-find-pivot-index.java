class Solution {
    public int pivotIndex(int[] nums) {
        int current=0,left_sum=0, right_sum=0, sum=0;
        for(int i=0;i<nums.length;i++){
           sum=sum+ nums[i];
    }
    for(int i=0;i<nums.length;i++){
        current = nums[i];
        if(left_sum == (sum-left_sum-nums[i])){
            return i;
        
        }
        left_sum +=nums[i];
        
    }
    return -1;
    }

}