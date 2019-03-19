//Use DP
//Just the solution part

class SolutionofLeetCode63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row = obstacleGrid.length;
		if (row == 0) {
			return 0;
		}
		int column = obstacleGrid[0].length;
		if (column == 0) {
			return 0;
		}

		if (row == 1) {
			for (int j = 0; j < column; j++) {
				if (obstacleGrid[0][j] == 1) {
					return 0;
				}
			}
			return 1;
		}
		if (column == 1) {
			for (int i = 0; i < row; i++) {
				if (obstacleGrid[i][0] == 1) {
					return 0;
				}
			}
			return 1;
		}

		int dp[][] = new int[row][column];

		for (int j = 0; j < column; j++) {
			dp[0][j] = 1;
			if (obstacleGrid[0][j] == 1) {
				for (int k = j; k < column; k++) {
					dp[0][k] = 0;
				}
				break;
			}

		}

		for (int i = 0; i < row; i++) {
			dp[i][0] = 1;
			if (obstacleGrid[i][0] == 1) {
				for (int k = i; k < row; k++) {
					dp[k][0] = 0;
				}
				break;
			}
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < column; j++) {
				if (obstacleGrid[i][j] == 1) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
				}

			}
		}

		return dp[row - 1][column - 1];
	}
}
