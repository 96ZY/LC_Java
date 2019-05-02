//just the solution part
//use bfs
class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> answer1 = new ArrayList<>();

		if (root == null) {
			return answer1;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode head = queue.poll();
				list.add(head.val);
				if (head.left != null) {
					queue.add(head.left);
				}
				if (head.right != null) {
					queue.add(head.right);
				}
			}
			answer1.add(list);
		}
		List<List<Integer>> answer2 = new ArrayList<>();
		for (int i = answer1.size() - 1; i >= 0; i--) {
			answer2.add(answer1.get(i));
		}
		return answer2;
	}
}
