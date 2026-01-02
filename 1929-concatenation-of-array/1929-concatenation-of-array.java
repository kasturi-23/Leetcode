class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length + nums.length;
        int[] size = new int[n];
        for(int i=0;i<nums.length;i++){
            size[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            size[i+nums.length]=nums[i];
        }
        return size;
        }
}