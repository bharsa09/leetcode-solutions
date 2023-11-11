class Solution {
    private int m;
    private int n;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        m=image.length;
        n=image[0].length;
        int prevColor=image[sr][sc];
        dfs(image,sr,sc,color,prevColor);
        return image;
    }

    public void dfs(int[][] image,int i,int j,int cl,int prCl){
        if(i<0 || j<0 || i>=m || j>=n || image[i][j]!=prCl || image[i][j]==cl) return;
        image[i][j]=cl;
        dfs(image,i+1,j,cl,prCl);
        dfs(image,i-1,j,cl,prCl);
        dfs(image,i,j+1,cl,prCl);
        dfs(image,i,j-1,cl,prCl);
    }
}