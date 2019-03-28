//Solution is useless
import java.util.*;

class Solution {
	public boolean isValid(String s) {
		if (s == null) {
			return false;
		}
		int L = s.length();
		int l = L / 2;
		if (l * 2 != L) {
			return false;
		} else {
			int a1 = 0;
			int a2 = 0;
			int b1 = 0;
			int b2 = 0;
			int c1 = 0;
			int c2 = 0;
			for (int i = 0; i < L; i++) {
				if (s.charAt(i) == 40) {
					a1++;
				}
				if (s.charAt(i) == 41) {
					a2++;
				}
				if (s.charAt(i) == 91) {
					b1++;
				}
				if (s.charAt(i) == 93) {
					b2++;
				}
				if (s.charAt(i) == 123) {
					c1++;
				}
				if (s.charAt(i) == 125) {
					c2++;
				}
			}
			if ((a1 != a2) || (b1 != b2) || (c1 != c2)) {
				return false;
			} else {
				while (s != null) {

				}
			}

		}
		return true;
	}
}

class Solution2 {

	// Hash table that takes care of the mappings.
	private HashMap<Character, Character> mappings;

	// Initialize hash map with mappings. This simply makes the code easier to read.
	public Solution2() {
		this.mappings = new HashMap<Character, Character>();
		this.mappings.put(')', '(');
		this.mappings.put('}', '{');
		this.mappings.put(']', '[');
	}

	public boolean isValid(String s) {

		// Initialize a stack to be used in the algorithm.
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			// If the current character is a closing bracket.
			if (this.mappings.containsKey(c)) {

				// Get the top element of the stack. If the stack is empty, set a dummy value of
				// '#', otherwise, return the top element of the stack and then delete it by stack.pop()
				char topElement = stack.empty() ? '#' : stack.pop();

				// If the mapping for this bracket doesn't match the stack's top element, return
				// false.
				if (topElement != this.mappings.get(c)) {
					return false;
				}
			} else {
				// If it was an opening bracket, push to the stack.
				stack.push(c);
			}
		}

		// If the stack still contains elements, then it is an invalid expression.
		return stack.isEmpty();
	}
}

public class vaildp extends Solution2 {
	public static void main(String[] args) {
		vaildp v = new vaildp();
		String s = "()";
		v.isValid(s);
	}
}
