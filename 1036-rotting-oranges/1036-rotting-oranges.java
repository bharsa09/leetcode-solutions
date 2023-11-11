class Solution {

    public int orangesRotting(int[][] grid) {

        int n=grid.length;
        int m=grid[0].length;

        int fresh=0;


        Queue<int[]> q=new LinkedList();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        if(fresh==0) return 0;
        int count=0;
        
        int direction[][]={ {1,0},{-1,0},{0,1},{0,-1} }; //very important lesson here 

        while(!q.isEmpty()){
            int k=q.size();
            for(int i=0;i<k;i++){
                int[] temp=q.poll();

                for(int dir[]:direction){
                    int x=temp[0]+dir[0];
                    int y=temp[1]+dir[1];
                    
                    if(x<0 || y<0 || x>=n || y>=m || grid[x][y]==0 || grid[x][y]==2)continue;

                    grid[x][y]=2;
                    q.offer(new int[]{x,y});
                    fresh--;
                }
            }
            count++;
        }
        //count-1 because last level we marked as rotten but queue is not empty 
        //so queue will run till it gets empty
        //but last run we increment our count extra 
        //so we have to subtract 1
        return fresh==0?count-1:-1;
    }

    
}