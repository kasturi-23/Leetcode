class Solution {
    public int compress(char[] chars) {
        int index=0,i=0;
        while(i<chars.length){
            int count=0;
            char current= chars[i];
            while(i<chars.length&& chars[i]==current){
                i++;
                count++;
            }
            chars[index++] = current;
             if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        return index;  }
}