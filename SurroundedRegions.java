//just the solution part
//use bfs
class Coordinate {
	int x, y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class SolutionofLeetCode130 {
	public void solve(char[][] board) {
		if (board == null) {
			return;
		}
		int row = board.length;
		if (row == 0 || row == 1 || row == 2) {
			return;
		}
		int column = board[0].length;
		if (column == 0 || column == 1 || column == 2) {
			return;
		}
		for (int i = 1; i < row - 1; i++) {
			for (int j = 1; j < column - 1; j++) {
				if (board[i][j] == 'O') {
					captureRegions(board, i, j);
				}
			}
		}

		return;
	}

	public void captureRegions(char[][] board, int x, int y) {
		int[] directionX = { 0, 1, -1, 0 };
		int[] directionY = { 1, 0, 0, -1 };

		Queue<Coordinate> queue = new LinkedList<>();
		List<Coordinate> list = new ArrayList<>();

		queue.offer(new Coordinate(x, y));
		list.add(new Coordinate(x, y));
		board[x][y] = 'X';

		while (!queue.isEmpty()) {
			Coordinate coor = queue.poll();
			for (int i = 0; i < 4; i++) {
				Coordinate adj = new Coordinate(coor.x + directionX[i], coor.y + directionY[i]);
				if (board[adj.x][adj.y] == 'O') {
					if (inBorder(adj.x, adj.y, board)) {
						for (int k = 0; k < list.size(); k++) {
							board[list.get(k).x][list.get(k).y] = 'O';
						}
						return;
					}
					board[adj.x][adj.y] = 'X';
					queue.offer(adj);
					list.add(adj);
				}
			}
		}
	}

	public boolean inBorder(int x, int y, char[][] board) {
		if (x == 0 || y == 0 || x == board.length - 1 || y == board[0].length - 1) {
			return true;
		}
		return false;
	}
}
