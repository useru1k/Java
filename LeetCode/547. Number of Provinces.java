class Solution {
    public void dfs(int in,int[][] mat,boolean[] visited)
    {
        visited[in] = true;
        // Make the node as visited if it check
        for(int i=0;i<mat.length;i++)
        {
            // Run the adjencent value of the current node and also it not visited also
            if(!visited[i] && mat[in][i] == 1)
            dfs(i,mat,visited); // Recall it 
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        boolean[] visited = new boolean[V+1];
        int count = 0;
        for(int i=0;i<V+1;i++)
        {
            if(!visited[i])
            {
                ++count;
                dfs(i,isConnected,visited);
            }
        }
        return count-1;
    }
}
