//just the solution part

class SolutionofLeetCode228 {
	public List<String> summaryRanges(int[] nums) {
		List<String> ans = new ArrayList<>();
		int L = nums.length;
		if (L == 0) {
			return ans;
		}
		if (L == 1) {
			ans.add(String.valueOf(nums[0]));
			return ans;
		}
		int begin = 0;
		int end = 0;
		for (int i = 0; i < L - 1; i++) {

			if (nums[i + 1] - nums[i] != 1) {
				end = i;

				if (end == begin) {
					// System.out.println("begin="+begin+" end="+end);
					ans.add(String.valueOf(nums[i]));
				} else {
					ans.add(String.valueOf(nums[begin]) + "->" + String.valueOf(nums[end]));
				}

				if (end == L - 2) {
					ans.add(String.valueOf(nums[L - 1]));
				}

				begin = i + 1;
			}

			if (nums[i + 1] - nums[i] == 1 && i == L - 2) {
				ans.add(String.valueOf(nums[begin]) + "->" + String.valueOf(nums[L - 1]));
			}

		}
		return ans;
	}
}
