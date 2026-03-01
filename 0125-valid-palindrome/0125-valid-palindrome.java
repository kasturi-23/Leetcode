class Solution {
    public boolean isPalindrome(String s) {
       String sentence = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
       boolean finans=true;
       char[] arr= sentence.toCharArray();
       int left=0,right=arr.length-1;
       while(left<=right){
        if(arr[left]!=arr[right]){
            finans=false;
            break;
        }
        else{
            left++;
            right--;
            finans=true;
            
        }
       } 
       return finans;
    }
}