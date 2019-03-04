//Just the solution part
class Solutionofleetcode73 {
	public void setZeroes(int[][] matrix) {

		int rows[] = new int[matrix.length];
		int columns[] = new int[matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = 1;
					columns[j] = 1;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			if (rows[i] == 1) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = 0;
				}
			}

		}

		for (int j = 0; j < matrix[0].length; j++) {
			if (columns[j] == 1) {
				for (int i = 0; i < matrix.length; i++) {
					matrix[i][j] = 0;
				}
			}
		}

	}
}
