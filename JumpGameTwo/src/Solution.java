// Given an array of non-negative integers, you are initially positioned at the first index of the array.
// Each element in the array represents your maximum jump length at that position.
// Your goal is to reach the last index in the minimum number of jumps.
// You can assume that you can ALWAYS reach the last index.

// maxPos: to record the max position cur jump can reach. Starts from nums[0]
// mostCanReach: to record the furthest position can be jumped within the range of cur jump, starts from [0].
// jump: starts from 1
// Loop the array from index 1, if i is greater than maxPos means need 1 more jump. So jump++ and update maxPos to mostCanReach
// Then, update mostCanReach if i + nums[i] is bigger, and update
// Return jumps

public class Solution {
    public static void main(String[] args) {
        int [] nums = new int[]{2,3,1,1,4};
        System.out.print(new Solution().jump(nums));
    }

    public int jump(int[] nums) {
        if(nums == null || nums.length <= 1) {
            return 0;
        }

        int jump = 1;
        int maxPos = nums[0];
        int mostCanJump = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(i > maxPos) {
                jump++;
                maxPos = mostCanJump;
            }
            mostCanJump = Math.max(mostCanJump, i + nums[i]);
        }
        return jump;
    }
}
