//Just the solution part
class SolutionofLeetCode151 {
	public String reverseWords(String s) {
		s = s.trim();
		int L = s.length();
		if (L == 0) {
			return "";
		}
		String ans = "";
		/*
		 * for(int i=L-1;i>=1;i--){ for(int j=i-1;j>=0;j--){ if(s.charAt(i)!=' '){ int
		 * end = i; } if(s.charAt(j)=' '){ int begin = j; for(int k = begin;k,=end;k++){
		 * ans=ans+s.charAt(k); } ans = ans+' ';
		 * 
		 * break; } } }
		 */

		int index[] = new int[L];

		for (int i = 0; i < L; i++) {
			if (s.charAt(i) == ' ') {
				index[i] = 0;
			} else {
				index[i] = 1;
			}
		}

		String words[] = new String[L];
		for (int i = 0; i < L; i++) {
			words[i] = "t";
		}
		int num = 0;
		for (int i = 0; i < L; i++) {
			if (index[i] == 1) {

				words[num] = words[num] + s.charAt(i);
			} else {
				num++;
			}
		}

		for (int i = L - 1; i >= 0; i--) {
			// System.out.println(words[i]);

			if (words[i].length() > 1) {
				words[i] = words[i].substring(1);
				ans = ans + words[i] + " ";
			}
		}

		ans = ans.trim();

		return ans;
	}
}
