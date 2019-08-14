package com.leetcode.huang;

public class SolutionOfLeetcode278 {
	/*
	 * this problem is same as 'the first occurrence of X in an array';
	 */
}

/*
 * The isBadVersion API is defined in the parent class VersionControl. boolean
 * isBadVersion(int version);
 */

class Solution {
	public int firstBadVersion(int n) {
		if (n <= 0) {
			return -1;
		}

		int left = 1;
		int right = n;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid;
			}
		}

		if (isBadVersion(left)) {
			return left;
		}
		if (isBadVersion(right)) {
			return right;
		}

		return -1;
	}

	private boolean isBadVersion(int version) {
		/*
		 * some codes with return value;
		 * 
		 */
		return true;
	}
}
