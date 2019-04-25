//use BFS
//Just the solution part
/*
 * //Definition for a Node. class Node { public int val; public List<Node>
 * neighbors;
 * 
 * public Node() {}
 * 
 * public Node(int _val,List<Node> _neighbors) { val = _val; neighbors =
 * _neighbors; } };
 */
class SolutionofLeetCode133 {
	public Node cloneGraph(Node node) {
		if (node == null) {
			return node;
		}

		ArrayList<Node> nodes = getNodes(node);

		HashMap<Node, Node> mapping = new HashMap<>();
		for (Node n : nodes) {
			Node newNode = new Node();
			newNode.val = n.val;
			newNode.neighbors = new ArrayList<Node>();
			mapping.put(n, newNode);
		}

		for (Node n : nodes) {
			Node newNode = mapping.get(n);
			for (Node neighbor : n.neighbors) {
				Node newNeighbor = mapping.get(neighbor);
				newNode.neighbors.add(newNeighbor);
			}
		}

		return mapping.get(node);
	}

	private ArrayList<Node> getNodes(Node node) {
		Queue<Node> queue = new LinkedList<Node>();
		HashSet<Node> set = new HashSet<>();

		queue.offer(node);
		set.add(node);
		while (!queue.isEmpty()) {
			Node head = queue.poll();
			for (Node neighbor : head.neighbors) {
				if (!set.contains(neighbor)) {
					set.add(neighbor);
					queue.offer(neighbor);
				}
			}
		}

		return new ArrayList<Node>(set);
	}
}

//reference
//https://www.lintcode.com/problem/clone-graph/description
/**
* 本参考程序来自九章算法，由 @九章算法 提供。版权所有，转发请注明出处。
* - 九章算法致力于帮助更多中国人找到好的工作，教师团队均来自硅谷和国内的一线大公司在职工程师。
* - 现有的面试培训课程包括：九章算法班，系统设计班，算法强化班，Java入门与基础算法班，Android 项目实战班，
* - Big Data 项目实战班，算法面试高频题班, 动态规划专题班
* - 更多详情请见官方网站：http://www.jiuzhang.com/?source=code
*/ 

/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     ArrayList<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    /**
     * @param node: A undirected graph node
     * @return: A undirected graph node
     */
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return node;
        }

        // use bfs algorithm to traverse the graph and get all nodes.
        ArrayList<UndirectedGraphNode> nodes = getNodes(node);
        
        // copy nodes, store the old->new mapping information in a hash map
        HashMap<UndirectedGraphNode, UndirectedGraphNode> mapping = new HashMap<>();
        for (UndirectedGraphNode n : nodes) {
            mapping.put(n, new UndirectedGraphNode(n.label));
        }
        
        // copy neighbors(edges)
        for (UndirectedGraphNode n : nodes) {
            UndirectedGraphNode newNode = mapping.get(n);
            for (UndirectedGraphNode neighbor : n.neighbors) {
                UndirectedGraphNode newNeighbor = mapping.get(neighbor);
                newNode.neighbors.add(newNeighbor);
            }
        }
        
        return mapping.get(node);
    }
    
    private ArrayList<UndirectedGraphNode> getNodes(UndirectedGraphNode node) {
        Queue<UndirectedGraphNode> queue = new LinkedList<UndirectedGraphNode>();
        HashSet<UndirectedGraphNode> set = new HashSet<>();
        
        queue.offer(node);
        set.add(node);
        while (!queue.isEmpty()) {
            UndirectedGraphNode head = queue.poll();
            for (UndirectedGraphNode neighbor : head.neighbors) {
                if(!set.contains(neighbor)){
                    set.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        
        return new ArrayList<UndirectedGraphNode>(set);
    }
}
