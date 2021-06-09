// You are given two strings s1 and s2 of equal length consisting of letters "x" and "y" only. Your task is to make these two strings equal to each other. You can swap any two characters that belong to different strings, which means: swap s1[i] and s2[j].
//
// Return the minimum number of swaps required to make s1 and s2 equal, or return -1 if it is impossible to do so.

// Greedy:
// From s1 and s2, get the number of x and y when they are not match at position i
// If the module of x and y are not equal, return -1 since it's impossible to swap
// Get the value of x / 2 + y / 2 to get the min swaps
// If x % 2 and y % 2 is 0, return count
// Else, return count + 2 since the final string is "xy" and "yx"
// Time: O(n), Space: O(1)
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().minimumSwap("xxyyxyxyxx", "xyyxyxxxyx"));
    }
    public int minimumSwap(String s1, String s2) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                if(s1.charAt(i) == 'x') {
                    x++;
                }
                else {
                    y++;
                }
            }
        }
        if(x % 2 != y % 2) {
            return -1;
        }
        int count = x / 2 + y / 2;
        if(x % 2 == 0 && y % 2 == 0) {
            return count;
        }
        return count + 2;
    }
}
