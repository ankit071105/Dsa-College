public class Main {
    public static int powerSum(int[] nums, int k) {
        int MOD = (int)Math.pow(10, 7);
        int n = nums.length;
        int[] dp = new int[k+1];
        dp[0] = 1;

        for (int num : nums) {
            for (int j = k; j >= num; j--) {
                dp[j] = (dp[j] + dp[j - num]) % MOD;
            }
        }

        return dp[k];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;
        System.out.println("Output: " + powerSum(nums, k)); 
    }
}