//just the solution part
class SolutionofLeetCode167 {
	public int[] twoSum(int[] numbers, int target) {
		int L = numbers.length;
		int ans[] = new int[2];
		if (L == 0 || L == 1) {
			return ans;
		}
		int low = 0;
		int high = L - 1;
		while (low < high) {
			// int m = (high+low)/2;
			int sum = numbers[low] + numbers[high];
			if (sum == target) {
				ans[0] = low + 1;
				ans[1] = high + 1;
				break;
			} else if (sum > target) {
				high--;
			} else {
				low++;
			}
		}
		return ans;
	}
}
