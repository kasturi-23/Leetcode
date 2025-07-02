class Solution {
    public String gcdOfStrings(String str1, String str2) {
         String con1 = str1 + str2;
        String con2 = str2 + str1;
          String result = "";
        if (con1.equals(con2)) {
            int s1 = str1.length();
            int s2 = str2.length();

            int gcdLength = gcd(s1, s2);
            result = str1.substring(0, gcdLength);
        }

        return result;
    }

    // Helper method to find gcd of two numbers
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
        