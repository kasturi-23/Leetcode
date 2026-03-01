class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0;
        int left=0, right=numbers.length-1;
        while(left<right){
            sum = numbers[left]+numbers[right];
            if(target==sum){
                return new int[]{left + 1, right + 1};
                
            }
            else if(sum>target){
                right--;
            }
            else{
                left++;
            }

        }
        return new int[]{-1, -1};
    }
}