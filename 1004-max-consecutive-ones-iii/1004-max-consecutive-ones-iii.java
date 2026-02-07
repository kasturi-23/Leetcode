class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0;
        int right=0;
        int len=0;
        int max_count=0;
        int zero =0;
        while(right<nums.length){
            if(nums[right]==0){
                zero++;
            }
            if(zero>k){
                if(nums[left]==0){
                    zero--;
                    
                }
                left++;
            }
            if(zero<=k){
                len=right-left+1;
                max_count=Math.max(len,max_count);
            }
            right++;
        }
               return max_count;
    }
}