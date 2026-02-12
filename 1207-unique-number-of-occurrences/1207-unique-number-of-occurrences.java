import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        boolean result = true;

        // Store frequencies in list
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int n = e.getValue();
            list.add(n);
        }

        // Check for duplicate frequencies
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    result = false;
                }
            }
        }

        return result;
    }
}
