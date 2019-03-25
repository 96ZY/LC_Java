// just the solution part

class SolutionofLeetCode832 {
	public int[][] flipAndInvertImage(int[][] A) {
		int row = A.length;
		if (row == 0) {
			return new int[0][0];
		}
		int column = A[0].length;
		if (column == 0) {
			return new int[0][0];
		}
		int ans[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				ans[i][j] = A[i][column - 1 - j];
				ans[i][j] = 1 - ans[i][j];
			}
		}

		return ans;
	}
}
