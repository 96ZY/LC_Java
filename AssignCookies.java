//use greedy algorithm
//just the solution part

class SolutionofLeetCode455 {
	public int findContentChildren(int[] g, int[] s) {
		int lg = g.length;
		if (lg == 0) {
			return 0;
		}
		int ls = s.length;
		if (ls == 0) {
			return 0;
		}
		Arrays.sort(g);
		Arrays.sort(s);
		int count = 0;
		int i = 0;
		int j = 0;
		while (i != ls && j != lg) {
			if (s[i] >= g[j]) {
				count++;
				i++;
				j++;
			} else {
				i++;
			}
		}
		return count;

	}
}
