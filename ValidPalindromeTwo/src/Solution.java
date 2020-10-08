// Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

// Use 2 indices i and j start from the beginning and the end of string
// Check both letters at index i and j, if not the same, check:
// 1. If i and j are next to each other, return true
// 2. Try delete char at i (s[i+1] to s[j]) and delete char at j (s[i] to s[j-1]) and see if it becomes a palindrome
// Return true after the while loop

// Time: O(n), Space: O(1)

public class Solution {
    public static void main(String[] args) {
        System.out.print(new Solution().validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
    }

    public boolean validPalindrome(String s) {
        if(s.length() <= 1) {
            return true;
        }
        int i = 0;
        int j = s.length()-1;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                if(i + 1 == j) {
                    return true;
                }
                else {
                    return checkPalindrome(s.substring(i+1, j+1)) || checkPalindrome(s.substring(i, j));
                }
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean checkPalindrome(String str) {
        int i = 0;
        int j = str.length()-1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
