// Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome
// that can be built with those letters.
//Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

// All letters shows even times should be counted, odd times can only be counted once
// Use an array with length 123 to store the times each letter shows up
// Loop the array and use sum and boolean hasOdd to check if there is any odd
// Finally, if hasOdd is true, return sum + 1, else, return sum

// Time: O(n), Space: O(1)
public class Solution {
    public static void main(String[] args) {
        System.out.print(new Solution().longestPalindrome("abccccdd"));
    }

    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int [] arr = new int[123];
        for(int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int sum = 0;
        boolean hasOdd = false;
        for(int n : arr) {
            if(n % 2 == 0) {
                sum += n;
            }
            else {
                hasOdd = true;
                sum += n - 1;
            }
        }
        return hasOdd ? sum + 1 : sum;
    }
}
