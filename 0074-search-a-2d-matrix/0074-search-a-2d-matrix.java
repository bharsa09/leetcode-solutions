class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int i=0;
        int j=matrix.length-1;
        int rowStart=0;

        while(i<=j){
            int mid= (i+j)/2;

            if(matrix[mid][0]==target){
                return true;
            }else if(matrix[mid][0]>target){
                j=mid-1;
            }else{
                i=mid+1;
            }
            
        }
        rowStart=j;
 
        i=0;
        j=matrix[0].length-1;

        if(rowStart>-1){
            while(i<=j){
                int mid=(i+j)/2;

                if(matrix[rowStart][mid]==target){
                    return true;
                }else if(matrix[rowStart][mid]>target){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }

        }
 
        return false;
    }
}