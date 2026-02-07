class Solution {
    public int longestSubarray(int[] nums) {
        int left=0,right=0,max_length=0,len=0,zeros=0;
        while(right<nums.length){
            
            if(nums[right]==0){
                zeros++;
            }
            if(zeros>1){
                if(nums[left]==0){
                    zeros--;
                }
                left++;
            }
            if(zeros<=1){
                len=right-left;
                max_length=Math.max(len,max_length);
            }
            if(max_length == nums.length){
                max_length=max_length-1;
            }
            right++;
            
        }
        return max_length;
    }
}