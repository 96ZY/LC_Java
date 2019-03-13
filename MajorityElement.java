//Brute froce
//Just the solution part

class SolutionofLeetCode169 {
	public int majorityElement(int[] nums) {

		int L = nums.length;
		if (L == 1) {
			return nums[0];
		}

		int max = 0;
		int mark = 0;

		for (int i = 0; i < L - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < L; j++) {

				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count >= max) {
				max = count;
				mark = nums[i];
			}
		}

		return mark;

	}
}
