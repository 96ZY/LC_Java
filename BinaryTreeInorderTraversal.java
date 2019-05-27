//just the solution part

class SolutionOfLeetCode94 {
	List<Integer> result = new ArrayList<>();

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return result;
		}

		helper(root);
		return result;
	}

	private void helper(TreeNode root) {
		if (root == null) {
			return;
		}

		helper(root.left);
		result.add(root.val);
		helper(root.right);
	}

}
