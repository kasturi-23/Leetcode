class Solution {
    public int maxOperations(int[] nums, int k) {
        int sum=0,count=0;
        int i=0;
        int j= nums.length-1;
        Arrays.sort(nums);
        while(i<j){
            sum= nums[i]+nums[j];
            if(sum==k){
                count=count+1;
                i++;
                j--;
            }
            else if(sum>k){
                j--;
            }
            else{
                i++;
            }
        }
        return count;
    }
}