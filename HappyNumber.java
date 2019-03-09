	//Just the solution part
  class SolutionofLeetCode202 {
		public boolean isHappy(int n) {
			Set<Integer> set = new HashSet<>();
			while (n != 1) {
				int sum = 0;
				while (n > 0) {
					int digit = n % 10;
					sum = sum + digit * digit;
					n = n / 10;
				}
				n = sum;
				if (set.contains(n)) {
					return false;
				} else {
					set.add(n);
				}
			}
			return true;
		}
	}
