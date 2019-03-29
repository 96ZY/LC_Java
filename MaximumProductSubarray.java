//use dp
//just the solution part
class SolutionofLeetCode152 {
	public int maxProduct(int[] nums) {
		int L = nums.length;
		if (L == 0) {
			return 0;
		}
		if (L == 1) {
			return nums[0];
		}
		int[] a = new int[nums.length];
		a[0] = nums[0];

		// 用来存放负数最小值
		int[] b = new int[nums.length];
		b[0] = nums[0];

		int result = a[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] >= 0) {
				a[i] = Math.max(nums[i], a[i - 1] * nums[i]);
				b[i] = Math.min(nums[i], b[i - 1] * nums[i]);
			} else {
				a[i] = Math.max(nums[i], b[i - 1] * nums[i]);
				b[i] = Math.min(nums[i], a[i - 1] * nums[i]);
			}
			result = Math.max(result, a[i]);
		}
		return result;
	}
}
