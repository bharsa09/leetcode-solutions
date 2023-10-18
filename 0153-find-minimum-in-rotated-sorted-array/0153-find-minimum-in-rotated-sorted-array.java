class Solution {
    public int findMin(int[] arr) {
        int i=0;
        int N=arr.length;
        int j=N-1;
        
        while(i<=j){

            if(arr[i]<=arr[j]) return arr[i];

            int m=i+(j-i)/2;
            //modulo making sure we don't overflow and we are making an array kind of circular'
            int prev= arr[ (m+N-1)% N ];
            int next= arr[ (m+1)% N ];

            if( arr[m]<=prev && arr[m]<=next ){
                return arr[m];
            }
            //if left is sorted 
            if( arr[m]>=arr[i]){
                i=m+1;
            }else {
                j=m-1;
            }
            
        }
        return -1;
    }
}