class Solution {
    public int[] findRedundantConnection(int[][] edges) {

        int n=edges.length;
        Map<Integer,List<Integer>> adjList=new HashMap();

        for(int i=0;i<=n;i++){
            adjList.put(i,new ArrayList());
        }
       
        for(int[] arr:edges){
            adjList.get(arr[0]).add(arr[1]);
            adjList.get(arr[1]).add(arr[0]);
            if(isCycle(adjList,arr[0])) return arr;
        }
        return new int[]{};
    }

    boolean isCycle(Map<Integer,List<Integer>> adjList,int source){
        boolean[] visited=new boolean[adjList.size()+1];
        return detectCycle(adjList,visited,source);
    }

    boolean detectCycle(Map<Integer,List<Integer>> adjList,boolean[] visited,int source){

        Queue<Integer>q =new LinkedList();
        q.offer(source);

        while(!q.isEmpty()){
            int off=q.poll(); 
            if(visited[off]) {
                return true;
            }
            visited[off]=true;
            List<Integer>temp=adjList.get(off);
            for(int i:temp){
                if(!visited[i])
                    q.offer(i);
            }
        }
        return false;
    }
}