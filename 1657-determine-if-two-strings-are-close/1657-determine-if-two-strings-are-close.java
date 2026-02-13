import java.util.*;

class Solution {
    public boolean closeStrings(String word1, String word2) {

        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> map_word1 = new HashMap<>();
        HashMap<Character, Integer> map_word2 = new HashMap<>();

        // Count frequency for word1
        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            map_word1.put(ch, map_word1.getOrDefault(ch, 0) + 1);
        }

        // Count frequency for word2
        for (int i = 0; i < word2.length(); i++) {
            char ch = word2.charAt(i);
            map_word2.put(ch, map_word2.getOrDefault(ch, 0) + 1);
        }

        // Check if both words use same characters
        if (!map_word1.keySet().equals(map_word2.keySet())) {
            return false;
        }

        // Get frequency lists
        List<Integer> l1 = new ArrayList<>(map_word1.values());
        List<Integer> l2 = new ArrayList<>(map_word2.values());

        // Sort both lists
        Collections.sort(l1);
        Collections.sort(l2);

        return l1.equals(l2);
    }
}
