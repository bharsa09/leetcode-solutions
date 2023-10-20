class Solution {
    public int countNegatives(int[][] grid) {

        int rowStart=0;
        int rowEnd=grid.length-1;
        int res=0;

        while(rowStart<=rowEnd){

            if(grid[rowStart][0]<0){
                res=res+grid[0].length;
                rowStart++;
                continue;
            }

            int low=0;
            int high=grid[0].length-1;
            while(low<=high){
                int mid=(low+high)/2;

                if(grid[rowStart][mid]<0){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            res=res+grid[0].length-low;
            rowStart++;

        }
        return res;

        
    }
}