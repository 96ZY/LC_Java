//Just the solution part
class Solutionofleetcode198 {
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
		int rob[] = new int[L + 1];

		rob[0] = nums[0];
		rob[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < L; i++) {
			rob[i] = Math.max(rob[i - 2] + nums[i], rob[i - 1]);
		}
		return rob[L - 1];
	}
}
