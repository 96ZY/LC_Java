//Just the solution part
//Use binary search

package com.leetcode.huang;

public class SolutionOfLeetcode852 {
	public static void main(String[] args) {
		Solution852 s = new Solution852();
		int[] array = new int[] { 0, 1, 0 };
		int index = s.peakIndexInMountainArray(array);
		System.out.println(index);
	}
}

//Time Complexity: O(log n)
//Space Complexity: O(1)
class Solution852 {
	public int peakIndexInMountainArray(int[] A) {
		if (A == null || A.length == 0) {
			return -1;
		}

		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
				return mid;
			} else if (A[mid] > A[mid - 1] && A[mid] < A[mid + 1]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return -1;
	}
}
