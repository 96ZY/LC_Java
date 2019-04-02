//just the solution part
//b1 and b2 represents the duplicated area of all cubes in rows and all cubes in columns, respectively.

class SolutionofLeetCode892 {
	public int surfaceArea(int[][] grid) {
		int row = grid.length;
		if (row == 0) {
			return 0;
		}
		int column = grid[0].length;
		if (column == 0) {
			return 0;
		}

		int a1 = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				a1 += grid[i][j] * 2;
			}
		}
		int b1 = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 1; j < column; j++) {
				b1 += Math.min(grid[i][j], grid[i][j - 1]);
			}
		}
		int area1 = a1 - b1 * 2;

		int a2 = 0;
		for (int j = 0; j < column; j++) {
			for (int i = 0; i < row; i++) {
				a2 += grid[i][j] * 2;
			}
		}
		int b2 = 0;
		for (int j = 0; j < column; j++) {
			for (int i = 1; i < row; i++) {
				b2 += Math.min(grid[i][j], grid[i - 1][j]);
			}
		}
		int area2 = a2 - b2 * 2;

		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (grid[i][j] == 0) {
					count++;
				}
			}
		}
		return 2 * (row * column - count) + area1 + area2;
	}
}
