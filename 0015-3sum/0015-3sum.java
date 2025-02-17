import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        List<List<Integer>> results=new ArrayList<>();
        int first,second,third;
        for(first=0;first<n-2;first++){
            if(first>0 && nums[first]==nums[first-1]){
                continue;
            }
        
        second=first+1;
        third= n-1;
        while(second<third){
            int sum=nums[first]+nums[second]+nums[third];
            if(sum==0){
                results.add(Arrays.asList(nums[first], nums[second], nums[third]));
                third--;

                while(second<third && nums[third] == nums[third + 1]){
                    third--;
                }
            }
            else if(sum>0){
                third--;
            }
            else{
                second++;
            }
        }}
    return results;
    }
}