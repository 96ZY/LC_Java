//just the solution part

class SolutionofLeetCode118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();

		if (numRows == 0) {
			return ans;
		}

		List<Integer> row1 = new ArrayList<>();
		row1.add(1);
		ans.add(row1);

		if (numRows == 1) {
			return ans;
		}

		List<Integer> row2 = new ArrayList<>();
		row2.add(1);
		row2.add(1);
		ans.add(row2);

		if (numRows == 2) {
			return ans;
		}

		for (int i = 2; i < numRows; i++) {
			List<Integer> row = new ArrayList<>();
			row.add(1);
			for (int j = 1; j < i; j++) {
				row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
			}
			row.add(1);
			ans.add(row);
		}

		return ans;
	}
}
