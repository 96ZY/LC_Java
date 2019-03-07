	//Just the solution part
  class SolutionofLeetCode53 {
		public int maxSubArray(int[] nums) {
			/*
			 * List<Integer> sums = new ArrayList<>(); int L = nums.length; if(L == 0){
			 * return 0; } if(L == 1){ return nums[0]; } for(int i = 0; i < L-1; i++){ int
			 * sum = nums[i]; for(int j = i + 1; j < L; j++){ sum = sum + nums[j];
			 * sums.add(sum); } } for(int i=0;i<L;i++){ sums.add(nums[i]); }
			 * 
			 * 
			 * return Collections.max(sums);
			 */

			int L = nums.length;
			if (L == 0) {
				return 0;
			}
			if (L == 1) {
				return nums[0];
			}
			int sums[] = new int[L];
			sums[0] = nums[0];
			for (int i = 1; i < L; i++) {
				sums[i] = Math.max(nums[i], sums[i - 1] + nums[i]);
				// System.out.println("sums["+i+"]="+sums[i]);
			}
			Arrays.sort(sums);
			return sums[L - 1];
		}
	}
