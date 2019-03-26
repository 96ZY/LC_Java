//use dp
//just the solution part
class SolutionofLeetCode978 {
	public int maxTurbulenceSize(int[] A) {
		int L = A.length;
		if (L == 0) {
			return 0;
		}
		if (L == 1) {
			return 1;
		}
		int max = 1;
		// rule 1
		int dp1[] = new int[L];
		dp1[0] = 1;
		for (int i = 1; i < L; i++) {
			if (i % 2 != 0) {
				if (A[i - 1] > A[i]) {
					dp1[i] = dp1[i - 1] + 1;
					if (dp1[i] > max) {
						max = dp1[i];
					}
				} else {
					dp1[i] = 1;
				}
			} else {
				if (A[i - 1] < A[i]) {
					dp1[i] = dp1[i - 1] + 1;
					if (dp1[i] > max) {
						max = dp1[i];
					}
				} else {
					dp1[i] = 1;
				}
			}
		}
		// rule 2

		int dp2[] = new int[L];
		dp2[0] = 1;
		for (int i = 1; i < L; i++) {
			if (i % 2 != 0) {
				if (A[i - 1] < A[i]) {
					dp2[i] = dp2[i - 1] + 1;
					if (dp2[i] > max) {
						max = dp2[i];
					}
				} else {
					dp2[i] = 1;
				}
			} else {
				if (A[i - 1] > A[i]) {
					dp2[i] = dp2[i - 1] + 1;
					if (dp2[i] > max) {
						max = dp2[i];
					}
				} else {
					dp2[i] = 1;
				}
			}
		}
		return max;
		/*
		 * Arrays.sort(dp1); Arrays.sort(dp2); return Math.max(dp1[L-1],dp2[L-1]);
		 */
	}
}
