class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        
        Map<Integer,List<Integer>> graph=new HashMap();

        for(int i=0;i<=n;i++){
            graph.put(i,new ArrayList());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && isConnected[i][j]==1){
                    graph.get(i+1).add(j+1);
                    graph.get(j+1).add(i+1);
                }
            }
        }

        boolean[] visit=new boolean[n+1];
        int count=0;

        for(int i=1;i<=n;i++){
            if(!visit[i]){
                dfs(graph,visit,i);
                count++;
            }
        }
        return count;
    }

    public void dfs(Map<Integer,List<Integer>> graph,boolean[] visit,int node){

        visit[node]=true;
        List<Integer> list=graph.get(node);

        for(int i:list){
            if(!visit[i]){
                dfs(graph,visit,i);
            }
        }
    }
}