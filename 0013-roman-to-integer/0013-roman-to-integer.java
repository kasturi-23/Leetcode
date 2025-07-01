import java.util.*;

class Solution {
    public int romanToInt(String s) {
        // Step 1: Define Roman numeral values
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int sum = 0;
        int prev = 0;

        // Step 2: Iterate from right to left over the string
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int curr = roman.get(ch);

            if (curr < prev) {
                sum -= curr;
            } else {
                sum += curr;
            }

            prev = curr;
        }

        return sum;
    }
}
