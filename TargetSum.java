//use dp
//Just the solution part
/*                  sum(P) - sum(N) = target
sum(P) + sum(N) + sum(P) - sum(N) = target + sum(P) + sum(N)
                       2 * sum(P) = target + sum(nums)
*/

class SolutionofLeetCode494 {
	public int findTargetSumWays(int[] nums, int S) {
		int L = nums.length;
		if (L == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < L; i++) {
			sum = sum + nums[i];
		}
		if (sum < S || (sum + S) % 2 != 0) {
			return 0;
		}

		sum = (sum + S) / 2;
		int[] dp = new int[sum + 1];
		dp[0] = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = sum; j >= nums[i]; j--) {
				dp[j] += dp[j - nums[i]];
			}
		}
		return dp[sum];

	}
}
