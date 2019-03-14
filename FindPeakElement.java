
class SolutionofLeetCode162 {
	public int findPeakElement(int[] nums) {
		int L = nums.length;
		if (L == 1) {
			return 0;
		}
		if (nums[0] > nums[1]) {
			return 0;
		}
		if (nums[L - 1] > nums[L - 2]) {
			return L - 1;
		}
		for (int i = 1; i < L - 1; i++) {
			if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
				return i;
			}
		}
		return -1;
	}
}
