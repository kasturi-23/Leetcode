class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int len= words.length;
        int count = 0;
        String word = words[len-1];
        for(char c: word.toCharArray()){
            count+=1;
        }
        return count;
    }
}