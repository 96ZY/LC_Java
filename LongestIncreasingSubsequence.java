//just the solution part
class SolutionofLeetCode300 {
		public int lengthOfLIS(int[] nums) {
			int L = nums.length;
			int dp[] = new int[L];
			if (L == 0) {
				return 0;
			}
			if (L == 1) {
				return 1;
			}
			dp[0] = 1;
			int max = 1;
			for (int i = 1; i < L; i++) {
				dp[i] = 1;
				for (int j = 0; j < i; j++) {

					if (nums[i] > nums[j] && dp[i] < dp[j] + 1) {
						dp[i] = dp[j] + 1;
					}
					if (dp[i] > max) {
						max = dp[i];
					}
				}
			}
			return max;
		}
	}
