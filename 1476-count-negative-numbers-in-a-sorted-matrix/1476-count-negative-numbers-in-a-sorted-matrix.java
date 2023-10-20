class Solution {
    public int countNegatives(int[][] grid) {

        int rowStart=0;
        int rowEnd=grid.length-1;
        int res=0;
        int lastNeg=grid[0].length-1;

        while(rowStart<=rowEnd){

            //edge case==>1
            if(grid[rowStart][0]<0){
                res=res+grid[0].length;
                rowStart++;
                continue;
            }

            //edge case==>2
            if(grid[rowStart][grid[0].length-1]>0){
                rowStart++;
                continue;
            }

            int low=0;
            int high=lastNeg;
            while(low<=high){
                int mid=(low+high)/2;

                if(grid[rowStart][mid]<0){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
            res=res+grid[0].length-low;
            
            //next iteration of the row is last negative number found which is 'low'
            //in previous row because columns are sorted and non-decreasing
            //if no negative number present then low will be equal to length of row
            //so it will give out of bound error in next iteration 
            //so we have to put check point above mentioned in edge case number 2
            lastNeg=low;

            rowStart++;

        }
        return res;

        
    }
}