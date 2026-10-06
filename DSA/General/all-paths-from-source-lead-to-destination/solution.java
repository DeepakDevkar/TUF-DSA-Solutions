class Solution {
    public boolean leadsToDestination(int n, int[][] edges, int source, int destination) {

        ArrayList<Integer>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
        }

        int[] visited = new int[n];

        return dfs(source, destination, graph, visited);
    }

    public boolean dfs(int node, int destination,
                       ArrayList<Integer>[] graph, int[] visited) {

       
        if (visited[node] == 1) {
            return false;
        }

      
        if (visited[node] == 2) {
            return true;
        }

       
        if (graph[node].isEmpty()) {
            return node == destination;
        }

        visited[node] = 1;

        for (int next : graph[node]) {
            if (!dfs(next, destination, graph, visited)) {
                return false;
            }
        }

        visited[node] = 2;

        return true;
    }
}