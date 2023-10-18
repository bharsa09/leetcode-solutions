class Solution {
    public int findMin(int[] arr) {
        int i=0;
        int j=arr.length-1;
        int m=0;
        while(i<=j){
            m=(i+j)/2;
            if(arr[m]<arr[j])
                j=m;
            else
                i=m+1;
        }
        return arr[m];
    }
}