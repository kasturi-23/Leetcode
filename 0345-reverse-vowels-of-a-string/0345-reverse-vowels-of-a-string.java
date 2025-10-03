import java.util.ArrayList;
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();  // convert String to char array
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (isVowel(arr[left]) && isVowel(arr[right])) {
                // swap
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            } else if (!isVowel(arr[left])) {
                left++;
            } else {
                right--;
            }
        }

        return new String(arr); // convert char[] back to String
    }

    private boolean isVowel(char c) {
        switch (c) {
            case 'a': case 'A':
            case 'e': case 'E':
            case 'i': case 'I':
            case 'o': case 'O':
            case 'u': case 'U':
                return true;
            default:
                return false;
        }
    }
}