//use DFS
//just the solution part

class SolutionofLeetCode200 {
	public int numIslands(char[][] grid) {
		int row = grid.length;
		if (row == 0) {
			return 0;
		}
		int column = grid[0].length;
		if (column == 0) {
			return 0;
		}
		int mark[][] = new int[row][column];

		int ans = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (mark[i][j] == 0 && grid[i][j] == '1') {
					DFS(mark, grid, i, j);
					ans++;
				}
			}
		}
		return ans;
	}

	public void DFS(int[][] mark, char[][] grid, int x, int y) {
		mark[x][y] = 1;
		int dx[] = new int[] { -1, 1, 0, 0 };
		int dy[] = new int[] { 0, 0, -1, 1 };
		for (int k = 0; k < 4; k++) {
			int newx = x + dx[k];
			int newy = y + dy[k];
			if (newx < 0 || newx >= mark.length || newy < 0 || newy >= mark[newx].length) {
				continue;
			}
			if (mark[newx][newy] == 0 && grid[newx][newy] == '1') {
				DFS(mark, grid, newx, newy);
			}
		}
	}
}
