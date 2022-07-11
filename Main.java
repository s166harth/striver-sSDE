import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;



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


class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return null;
        Queue<Node> q = new ArrayDeque<>();
        HashMap<Node,Node> hm = new HashMap<>();
        Node start = new Node(node.val);
        q.add(node);
        hm.put(node, start);
        while(!q.isEmpty())
        {
            Node cur = q.poll();
            if(!hm.containsKey(cur))
            {
                Node newnode = new Node(cur.val);
                hm.put(cur, newnode);
                q.add(newnode);
            }
            List<Node> nbr = cur.neighbors;
            Node n1 = hm.get(cur);
            for(Node nbrs : nbr)
            {
                if(!hm.containsKey(nbrs))
                {
                    Node n2 = new Node(nbrs.val);
                    hm.put(nbrs, n2);
                    q.add(nbrs);
                }
                Node n2 = hm.get(nbrs);
                n1.neighbors.add(n2);
            }

            
        }
        return start;

    }
}