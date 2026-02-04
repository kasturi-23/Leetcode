class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

// first window sum
for (int i = 0; i < k; i++) {
    windowSum += nums[i];
}

double maxAvg = (double) windowSum / k;

// slide window
for (int i = k; i < nums.length; i++) {
    windowSum += nums[i];       // add right element
    windowSum -= nums[i - k];   // remove left element

    double currAvg = (double) windowSum / k;
    maxAvg = Math.max(maxAvg, currAvg);
}

return maxAvg;
}
    }
