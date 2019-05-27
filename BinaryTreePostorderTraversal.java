//just the solution part
class SolutionOfLeetCode145 {
	List<Integer> result = new ArrayList<>();

	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null) {
			return result;
		}

		helper(root);
		return result;
	}

	private void helper(TreeNode node) {
		if (node == null) {
			return;
		}

		helper(node.left);
		helper(node.right);
		result.add(node.val);
	}
}
