//just the solution part
class SolutionOfLeetCode110 {
	private int notBalanced = -1;

	public boolean isBalanced(TreeNode root) {
		return maxDepth(root) != notBalanced;
	}

	private int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		if (left == notBalanced || right == notBalanced) {
			return notBalanced;
		}

		if (Math.abs(left - right) > 1) {
			return notBalanced;
		}

		return Math.max(left, right) + 1;
	}
}
