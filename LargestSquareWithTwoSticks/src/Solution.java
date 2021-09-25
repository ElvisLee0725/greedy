public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().largestSquare(13, 11));
    }

    public int largestSquare(int A, int B) {
        int largestPossible = (A + B) / 4;
        if(largestPossible < 1) {
            return 0;
        }
        int counter = 0;
        for(int i = largestPossible; i >= 1; i--) {
            int a = A;
            int b = B;
            while(counter < 4) {
                if(a >= i) {
                    a -= i;
                    counter++;
                }
                else if(b >= i) {
                    b -= i;
                    counter++;
                }
                else {
                    break;
                }
            }
            if(counter == 4) {
                return i;
            }
            else {
                counter = 0;
            }
        }
        return 0;
    }
}
