// Given an array of non-negative integers, you are initially positioned at the first index of the array.
// Each element in the array represents your maximum jump length at that position.
// Determine if you are able to reach the last index.

// Use a variable maxPosCanJump, starts from nums[0];
// Loop the input array from index i. If maxPosCanJump < i, just return false cause it cannot be reached
// Then, update maxPosCanJump if i + nums[i] is greater
// Check if maxPosCanJump is greater than the last index

// Time: O(n), Space: O(1)
public class Solution {
    public static void main(String[] args) {
        int [] nums = new int[]{3,2,1,0,4};
        System.out.print(new Solution().canJump(nums));
    }

    public boolean canJump(int[] nums) {
        if(nums.length <= 1) {
            return true;
        }
        int maxPosCanJump = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(maxPosCanJump < i) {
                return false;
            }
            maxPosCanJump = Math.max(maxPosCanJump, i + nums[i]);
        }
        return maxPosCanJump >= nums.length-1;
    }
}
