import java.util.*;

class DFS {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(2)));
        Solution obj = new Solution();
        ArrayList<Integer> ans = obj.dfsOfGraph(V, adj);
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
        System.out.println();
    }
}

class Solution {
    ArrayList<Integer> ans;

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ans = new ArrayList<Integer>();
        boolean[] vis = new boolean[V];
        // Perform DFS from each unvisited node
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(i, adj, vis);
            }
        }
        return ans;
    }

    public void dfs(int n, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[n] = true;
        ans.add(n);
        for (int i : adj.get(n)) {
            if (!vis[i])
                dfs(i, adj, vis);
        }
    }
}
