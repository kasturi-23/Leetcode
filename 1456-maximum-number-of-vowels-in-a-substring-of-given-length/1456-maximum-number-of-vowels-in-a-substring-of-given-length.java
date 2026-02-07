class Solution {
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int count = 0;
        int max_count=0;

        // initial window
        for(int i=0;i<k;i++){
            if(isVowel(arr[i])){
                count +=1;
            }
        }  
        max_count=count;  
        // sliding window
        for (int i = k; i < arr.length; i++) {
            if (isVowel(arr[i])) {
                count++;
            }
            if (isVowel(arr[i - k])) {
                count--;
            }
            max_count = Math.max(max_count, count);
        }
        
        max_count = Math.max(max_count, count);
        
        
    return max_count;
    }

    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
