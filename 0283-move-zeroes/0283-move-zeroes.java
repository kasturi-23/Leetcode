class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int i, count=0;
        int ans[] = new int[n];
        int numzeroes=0;
        for(i=0;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[numzeroes];
                nums[numzeroes]=temp;
                numzeroes++;
            }
        }}}
