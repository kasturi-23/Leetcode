class Solution {
    public int[] applyOperations(int[] nums) {
        int i=0;
        while(i<nums.length-1){
           if(nums[i]!=0 && nums[i]==nums[i+1]){
            nums[i]=nums[i]*2;
            nums[i+1]=0;
            i+=2;
           }
           else{
            i++;
           }
           
        }
        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                nums[index++] = nums[j];
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }

        return nums;
    }
}