//Use hash map
//just the solution part

class SolutionofLeetCode242 {
	public boolean isAnagram(String s, String t) {
		int Ls = s.length();
		int Lt = t.length();
		if (Ls != Lt) {
			return false;
		}
		if (Ls == 1) {
			if (s.charAt(0) != t.charAt(0)) {
				return false;
			} else {
				return true;
			}
		}
		/*
		 * for(int i=0;i<Ls-1;i++){ if(s.charAt(i)!=t.charAt(i)){
		 * if(s.charAt(i)!=t.charAt(i+1)||s.charAt(i+1)!=t.charAt(i)){ return false; }
		 * i++; } } return true;
		 */
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < Ls; i++) {
			if (!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			} else {
				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			}
		}
		for (int i = 0; i < Lt; i++) {
			if (!map.containsKey(t.charAt(i))) {
				return false;
			} else {
				map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
				if (map.get(t.charAt(i)) < 0) {
					return false;
				}
			}
		}
		return true;
	}
}
