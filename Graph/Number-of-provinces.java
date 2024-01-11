class Solution {


    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int visited[]) {

        visited[node]  = 1;

        for (Integer  it : adjList.get(node)) {

            if (visited[it] == 0) {

                dfs(it, adjList, visited);
            }
        }
    }

    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < V; i++) {

            //create a Arraylist each vertex under adjList

            adjList.add(new ArrayList<Integer>());

        }
        // code

        for (int i = 0; i < V; i++) {

            for (int j = 0; j < V; j++) {

                //self node not considered here

                if (adj.get(i).get(j) == 1 && i != j) {

                    adjList.get(i).add(j);
                    adjList.get(j).add(i);

                }

            }
        }


        int[] visited = new int[V];
        int cnt = 0;

        for (int i = 0; i < V; i++) {

            if (visited[i] == 0) {

                cnt++;
                dfs(i, adjList, visited);
            }




        }

        return cnt;
    }
}