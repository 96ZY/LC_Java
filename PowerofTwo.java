//just the solution part
class SolutionofLeetCode231 {
	public boolean isPowerOfTwo(int n) {
		if (n == 0) {
			return false;
		}
		if (n == 1) {
			return true;
		}
		if (n % 2 != 0) {
			return false;
		}
		while (n % 2 == 0) {
			n = n / 2;
		}
		if (n != 1) {
			return false;
		} else {
			return true;
		}

	}
}
