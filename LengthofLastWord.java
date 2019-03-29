//just the solution part
class SolutionofLeetCode58 {
	public int lengthOfLastWord(String s) {
		int L = s.length();
		if (L == 0) {
			return 0;
		}
		int end = 0;
		for (int i = L - 1; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				end = i;
				break;
			}

		}
		int begin = 0;
		;
		for (int i = end; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				begin = i + 1;
				break;
			}
			if (i == 0) {
				begin = 0;
			}
		}
		return end - begin + 1;
	}
}
