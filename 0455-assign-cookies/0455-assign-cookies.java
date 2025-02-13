import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g); // Sort greed factors (children)
        Arrays.sort(s); // Sort cookie sizes

        int left = 0, right = 0;
        int count = 0;

        while (left < g.length && right < s.length) {
            if (s[right] >= g[left]) { 
                count++;
                left++; // Move to next child
            }
            right++; // Always move to next cookie
        }

        return count;
    }
}
