class Solution {
    public String reverseStr(String s, int k) {
        if (s == null || k <= 0) return s;

        char[] arr = s.toCharArray();
        int n = arr.length;

        for (int start = 0; start < n; start += 2 * k) {
            int i = start;
            int j = Math.min(start + k - 1, n - 1);
            while (i < j) {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return new String(arr);
    }
}
