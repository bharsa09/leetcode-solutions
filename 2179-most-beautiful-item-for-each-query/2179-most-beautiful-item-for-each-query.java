class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {

        Arrays.sort(items,(a,b)->a[0]-b[0]);

        //[[1,7],[2,4],[3,5],[4,1]]. ==> this will fail 

        for(int i=1;i<items.length;i++){
            if(items[i-1][1]>items[i][1]){
                items[i][1]=items[i-1][1];
            }
        }
        
        int[] ans=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            ans[i]=binarySearch(items,queries[i]);
        }
        return ans;
    }

    int binarySearch(int[][] arr,int query){
        int low=0;
        int high=arr.length-1;
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(arr[mid][0]<=query){
                low=mid+1;
                ans=Math.max(ans,arr[mid][1]);
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
}