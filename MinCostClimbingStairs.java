//use dp
//just the solution part

class SolutionofLeetCode746 {
	public int minCostClimbingStairs(int[] cost) {
		int stairs = cost.length;
		if (stairs == 2) {
			return (int) Math.min(cost[0], cost[1]);
		}

		int dp[] = new int[stairs];
		dp[0] = cost[0];
		dp[1] = cost[1];

		for (int i = 2; i < stairs; i++) {
			dp[i] = (int) Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
		}

		return (int) Math.min(dp[stairs - 1], dp[stairs - 2]);
	}
}
