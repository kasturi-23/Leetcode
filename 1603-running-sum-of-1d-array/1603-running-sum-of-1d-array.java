class Solution {
    public int[] runningSum(int[] nums) {
        int i, sum=0;
        int count= nums.length;
        int[] s= new int[count];
        for(i=0;i<count;i++){
            sum= sum+ nums[i];
            s[i]=sum;
        }
        return s;
    }
}