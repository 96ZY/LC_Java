//Just the solution part

	class SolutionofLeetCode322 {
		public int coinChange(int[] coins, int amount) {
			int L = coins.length;
			if (L == 0) {
				return -1;
			}
			int dp[] = new int[amount + 1];//build an array to store the answer for each amount i
			for (int i = 0; i <= amount; i++) {//set all dp for each amount i as -1
				dp[i] = -1;
			}
			dp[0] = 0;//when amount = 0, the answer must be 0
			for (int i = 1; i <= amount; i++) {
				for (int j = 0; j < L; j++) {
					if (i - coins[j] >= 0 && dp[i - coins[j]] != -1) {
						if (dp[i] == -1 || dp[i] > dp[i - coins[j]] + 1) {
							dp[i] = dp[i - coins[j]] + 1;
						}
					}
				}
			}
			return dp[amount];
		}
	}
