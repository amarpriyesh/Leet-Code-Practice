/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer, Node> map;
    Set<Integer> visited;
    public Node cloneGraph(Node node) {
        map = new HashMap<>();    
        visited = new HashSet<>();
        
        if (node == null) {
            return null;
        }
        
        Node head = null;
        Node k = helper(node, head);
       
        
        return k;
    }
    
    public Node helper(Node node, Node head) {
        
        visited.add(node.val);
        
        if (node.neighbors.size() == 0) {
            head = map.computeIfAbsent(node.val, k ->  new Node(k));
            
            return head;
        }
        
        
        head = map.computeIfAbsent(node.val, k ->  new Node(k));
        
        
        for (Node k: node.neighbors) {
           Node l = map.computeIfAbsent(k.val, v ->  new Node(v));
            head.neighbors.add(l);
            // System.out.println(head.val+ " " );
            // head.neighbors.forEach(a -> System.out.print(a.val + ","));
            // System.out.println();
            if (!visited.contains(k.val)) {
                helper(k, l);
            }
               
            
        }
        
        return head;
        
    }
}