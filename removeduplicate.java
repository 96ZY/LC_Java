//just the solution part, Solution is written by myself, the officialSolution is by LeetCode
//双指针法

class Solution {
	public int removeDuplicates(int[] nums) {
		int L = nums.length;
		// int d=0;
		if (L == 0) {
			return 0;
		}
		/*
		 * for(int i=0;i<L-1;i++){ for(int j=i+1;j<L;j++){ if(nums[i]==nums[j]){ d++;
		 * }else{ i=j;
		 * 
		 * } } }
		 */
		if (L == 1) {
			return 1;
		}

		int k = 0;
		for (int i = 0; i < L - 1; i++) {
			for (int j = i + 1; j < L; j++) {
				if (nums[i] != nums[j]) {
					k++;
					nums[k] = nums[j];

					i = j;

				}
			}
		}
		// System.out.println("return k+1="+(k+1));
		return k + 1;
	}
}
class officialSolution{
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }
    return i + 1;
}
}
