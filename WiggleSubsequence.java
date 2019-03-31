//use greedy algorithm
//just the solution part

class SolutionofLeetCode376 {
	public int wiggleMaxLength(int[] nums) {
		int L = nums.length;
		if (L == 0) {
			return 0;
		}
		if (L == 1) {
			return 1;
		}
		if (L == 2) {
			if (nums[0] != nums[1]) {
				return 1;
			} else {
				return 1;
			}
		}
		int dp[] = new int[L];
		// dp[0]=nums[0];
		dp[0] = 1;
		int i = 1;
		// int count=0;
		// int begin=0;
		// int end=0;
		while (i < L - 1) {
			/*
			 * if(nums[i]>nums[i-1]){
			 * 
			 * //dp[begin]=nums[i-1]; dp[i]=dp[i-1]; i++; }
			 * 
			 * 
			 * if(nums[i]<=nums[i-1]){ dp[i]=dp[i-1] end=i-1; dp[end]=nums[i-1]; begin=i;
			 * i++; }
			 */

			// System.out.println("i="+i+" dp[i-1]="+dp[i-1]);
			if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
				dp[i] = dp[i - 1] + 1;
				i++;
			} else if (nums[i] < nums[i - 1] && nums[i] < nums[i + 1]) {
				dp[i] = dp[i - 1] + 1;
				i++;
			} else if (nums[i] == nums[i - 1] && i > 2) {
				nums[i - 1] = nums[i - 2];
				dp[i] = dp[i - 1];

			} else {
				dp[i] = dp[i - 1];
				i++;
			}

		}
		/*
		 * Arrays.sort(nums); if(nums[L-1]==nums[0]){ return 1;
		 * 
		 * }
		 */

		if (dp[L - 2] == 1 && nums[L - 1] == nums[L - 2]) {
			return 1;
		}
		return dp[L - 2] + 1;
	}
}
