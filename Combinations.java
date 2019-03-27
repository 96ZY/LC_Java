//just the solution part

class SolutionofLeetCode77 {
	public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

	public static int path[] = new int[50];

	public static int K;

	public void robot(int idx, int n, int k) {
		if (k == 0) {
			List<Integer> temp = new ArrayList<>();
			for (int i = 0; i < K; i++) {
				temp.add(path[i]);
			}
			ans.add(temp);
			return;
		}

		for (int i = idx + 1; i <= n; i++) {
			path[k - 1] = i;
			robot(i, n, k - 1);
		}
	}

	public List<List<Integer>> combine(int n, int k) {
		ans.clear();
		K = k;
		robot(0, n, k);
		return ans;
	}
}
