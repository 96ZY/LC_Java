//just the solution part

class SolutionofLeetCode349 {
	public int[] intersection(int[] nums1, int[] nums2) {
		int L1 = nums1.length;
		int L2 = nums2.length;
		if (L1 == 0 || L2 == 0) {
			return new int[0];
		}
		Set<Integer> set = new HashSet<>();
		Set<Integer> same = new HashSet<>();

		for (int i = 0; i < L1; i++) {
			set.add(nums1[i]);
		}

		for (int j = 0; j < L2; j++) {
			if (set.contains(nums2[j])) {
				same.add(nums2[j]);
			}
		}
		int index = 0;
		int ans[] = new int[same.size()];
		for (int val : same) {
			ans[index] = val;
			index++;
		}

		return ans;

	}
}
