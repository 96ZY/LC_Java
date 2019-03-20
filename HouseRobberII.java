//use 2 dp arrays
//just the solution part
class SolutionofLeetCode213 {
	public int rob(int[] nums) {
		int L = nums.length;
		if (L == 0) {
			return 0;
		}
		if (L == 1) {
			return nums[0];
		}
		if (L == 2) {
			return Math.max(nums[0], nums[1]);
		}
		if (L == 3) {
			return Math.max(nums[0], Math.max(nums[1], nums[2]));
		}

		int dp[] = new int[L];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);

		int dp2[] = new int[L];
		dp2[0] = 0;
		dp2[1] = nums[1];
		dp2[2] = Math.max(nums[1], nums[2]);

		for (int i = 2; i < L - 1; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}

		for (int i = 3; i < L; i++) {
			dp2[i] = Math.max(dp2[i - 1], dp2[i - 2] + nums[i]);
		}
		// System.out.println("dp[L-1]="+dp[L-1]);
		// System.out.println("dp2[L-1]="+dp2[L-1]);

		/*
		 * if(dp[1]>dp[0]+nums[2]&&nums[1]>=nums[0]){ return dp[L-1]; }
		 * 
		 * if(dp[1]==dp[0]+nums[2]&&nums[1]>=nums[0]){ return dp[L-1]; }
		 * 
		 * if(dp[1]<dp[0]+nums[2]){ return dp2[L-1]; }
		 * 
		 * if(dp[L-1]==dp[L-2]){ return dp[L-1]; }else{ if(dp2[L-1]!=dp[L-1]){ return
		 * dp2[L-1]; }else{ return dp2[L-1]; } }
		 */
		/*
		 * if(dp[L-1]==dp[L-2]){ System.out.println("wc"); return dp[L-1]; }else{ int
		 * temp1=dp[L-1]-nums[L-1]; int temp2=dp[L-1]-nums[0]; return
		 * Math.max(dp[L-2],Math.max(temp1,temp2)); }
		 */
		return Math.max(dp[L - 2], dp2[L - 1]);
		// return 0;
	}
}
