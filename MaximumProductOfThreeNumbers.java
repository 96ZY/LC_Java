//just the solution part
class SolutionOfLeetcode628 {
	public int maximumProduct(int[] nums) {
		if (nums.length < 3) {
			return -1;
		}
		if (nums.length == 3) {
			return nums[0] * nums[1] * nums[2];
		}

		Arrays.sort(nums);

		int positive = 0;

		for (int i = nums.length - 1; i > 0; i--) {
			if (nums[i] > 0) {
				positive++;
			}
			if (positive == 3) {
				break;
			}
		}

		if (positive == 0) {
			return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
		}
		if (positive == 1 || positive == 2) {
			return nums[0] * nums[1] * nums[nums.length - 1];
		}
		if (positive == 3) {
			if (nums[0] * nums[1] > nums[nums.length - 3] * nums[nums.length - 2]) {
				return nums[0] * nums[1] * nums[nums.length - 1];
			} else {
				return nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1];
			}
		}

		return 0;
	}
}
