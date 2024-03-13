import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList(2, 3, 1)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(0, 4)));
        adj.add(new ArrayList<>(Arrays.asList(0)));
        adj.add(new ArrayList<>(Arrays.asList(2)));
        Solution obj = new Solution();
        ArrayList<Integer> ans = obj.bfsOfGraph(V, adj);
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
        System.out.println();
    }
}

class Solution {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[V];
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int val=q.poll();
            ans.add(val);
            for(int i: adj.get(val)){
                if(vis[i]==false){
                    vis[i]=true;
                    q.offer(i);
                }
            }
        }
        return ans;
    }
}
