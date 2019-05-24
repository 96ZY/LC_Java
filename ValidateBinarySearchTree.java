//just the solution part
class SolutionOfLeetCode98 {
	private TreeNode lastNode;
	private boolean isValid;

	public boolean isValidBST(TreeNode root) {
		lastNode = null;
		isValid = true;
		inOrderTraverse(root);

		return isValid;
	}

	private void inOrderTraverse(TreeNode root) {
		if (root == null) {
			return;
		}

		inOrderTraverse(root.left);

		if (lastNode != null && lastNode.val >= root.val) {
			isValid = false;
			return;
		}
		lastNode = root;
		inOrderTraverse(root.right);
	}
}
