class Solution {
 public boolean isPalindrome(String s) {
        StringBuilder reversed = new StringBuilder();

        for(char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                reversed.append(Character.toLowerCase(c));
            }
        }

        return 
        reversed.toString().equals(reversed.reverse().toString());
    }
}
