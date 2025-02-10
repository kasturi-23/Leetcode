import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int left = 0, right = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
         
        List<Integer> result = new ArrayList<>();
        
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                result.add(nums1[left]); // Add element as many times as it appears in both
                left++;
                right++;
            } 
            else if (nums1[left] < nums2[right]) {
                left++; // Move left pointer forward
            } 
            else {
                right++; // Move right pointer forward
            }
        }
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
