import java.util.*;

class Solution {
	public boolean isValidSudoku(char[][] board) {
		//define 9 hash maps for rows, columns, and boxes respectively
		HashMap<Integer, Integer>[] rows = new HashMap[9];
		HashMap<Integer, Integer>[] columns = new HashMap[9];
		HashMap<Integer, Integer>[] boxes = new HashMap[9];
		for (int i = 0; i < 9; i++) {
			rows[i] = new HashMap<Integer, Integer>();
			columns[i] = new HashMap<Integer, Integer>();
			boxes[i] = new HashMap<Integer, Integer>();
		}
		
		int index = 0; //define the index the sub-boxes(3x3)
		int base = 1; // it defines the first value for a key, and if there exist the same key latter, the value will be key+value
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					int num = (int) board[i][j];
					index = (i / 3) * 3 + j / 3; //get the index of the sub=boxes by i and j

					rows[i].put(num, rows[i].getOrDefault(num, 0) + base); //add keys and corresponding values for a row
					columns[j].put(num, columns[j].getOrDefault(num, 0) + base); // add keys and corresponding values for a column
					boxes[index].put(num, boxes[index].getOrDefault(num, 0) + base); //add keys and corresponding values for a sub-box

					if (rows[i].get(num) > base || columns[j].get(num) > base || boxes[index].get(num) > base) {
						return false;
					}
				}

			}
		}
		return true;
	}
}

public class ValidSudoku {

}

