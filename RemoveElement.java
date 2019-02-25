// Just the solution part
// Solution is written by myself
// Solution2 is by LeetCode
// 都是双指针方法
class Solution {
	public int removeElement(int[] nums, int val) {

		int L = nums.length;
		if (L == 0) {
			return 0;
		}
		int i = 0;
		for (int j = 0; j < L; j++) {
			if (nums[j] != val) {
				nums[i] = nums[j];
				i++;
			}
		}
		return i;
	}
}

class Solution2{
public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;
}
}
