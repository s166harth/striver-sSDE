import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> result = new ArrayList<>();
        
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        
        boolean[] visited = new boolean[V];
        visited[0] = true;
        
        while(!q.isEmpty()) {
            int v = q.poll();
            result.add(v);
            
            ArrayList<Integer> adjList = adj.get(v);
            for(int i : adjList) {
                if(!visited[i]) {
                    visited[i] = true;
                    q.add(i);    
                }
            }
        }
        
        return result;
    }
}