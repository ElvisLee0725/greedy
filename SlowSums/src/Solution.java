import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Suppose we have a list of N numbers, and repeat the following operation until we're left with only a single number: Choose any
// two numbers and replace them with their sum. Moreover, we associate a penalty with each operation equal to the value of the new number,
// and call the penalty for the entire list as the sum of the penalties of each operation.
// For example, given the list [1, 2, 3, 4, 5], we could choose 2 and 3 for the first operation, which would transform the list
// into [1, 5, 4, 5] and incur a penalty of 5. The goal in this problem is to find the worst possible penalty for a given input.
public class Solution {
    public static void main(String[] args) {
        int [] arr = {2, 3, 9, 8, 4};
        System.out.print(new Solution().getTotalTime(arr));
    }

    // Find the largest 2 numbers in the array, sum them up and put it back to the array.
    // => Sort the input array and convert it to a ArrayList. Each time append the sum and sum up the last 2 numbers
    // Use a res variable to record the sum of each operation
    // Return the res when the size of the arr is 1
    // Edge Case:
    // a. Array size is 1, return 0
    // b. Array size is 2, return arr[0] + arr[1]
    // Time: O(nlogn), Space: O(n)

    int getTotalTime(int[] arr) {
        // Write your code here
        if (arr.length == 1) {
            return 0;
        } else if (arr.length == 2) {
            return arr[0] + arr[1];
        }

        List<Integer> list = new ArrayList();
        Arrays.sort(arr);
        for (int num : arr) {
            list.add(num);
        }
        int sum = 0;
        while (list.size() > 1) {
            int temp = (list.get(list.size() - 1) + list.get(list.size() - 2));
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(temp);
            sum += temp;
        }
        return sum;
    }
}