class Solution {
    public int singleNonDuplicate(int[] arr) {

        

        int mod=arr.length;
        int low=0;
        int high=arr.length-1;
        if(high==0)return arr[high];


        while(low<=high){
            int mid=low + (high-low)/2;

            if(arr[(mid+1)%mod]!=arr[mid] && arr[(mid-1+mod)%mod]!=arr[mid]){
                return arr[mid];
            }else if( (arr[(mid-1+mod)%mod]==arr[mid] && mid%2==1) || (arr[(mid+1)%mod]==arr[mid] && mid%2==0)){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
        
    }
}