class Solution {
    private int n;
    private int m;
    public int numIslands(char[][] grid) {
        int count=0;
        n=grid.length;
        m=grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
        
    }


    public void dfs(char[][] grid,int i,int j){
        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]=='0') return ;

        grid[i][j]='0';

        if(i+1<grid.length && grid[i+1][j]=='1'){
            dfs(grid,i+1,j);
        }
        if(i-1>=0 && grid[i-1][j]=='1'){
            dfs(grid,i-1,j);
        }
        if(j+1<grid[i].length && grid[i][j+1]=='1'){
            dfs(grid,i,j+1);
        }
        if(j-1>=0 && grid[i][j-1]=='1'){
            dfs(grid,i,j-1);
        }
        
    }
}