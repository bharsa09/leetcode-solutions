class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length==0) return new int[0];
        int [][]map=new int[arr.length][2];

        for(int i=0;i<arr.length;i++){
            map[i][0]=i;
            map[i][1]=arr[i];
        }

        Arrays.sort(map,(a,b)->a[1]-b[1]);
        int []res=new int [arr.length];

        res[map[0][0]]=1;
        int rank=1;
        for(int i=1;i<arr.length;i++){
            if(map[i-1][1] != map[i][1]){
                res[map[i][0]]=++rank;
            }else{
                res[map[i][0]]=rank;
            }
        }
        return res;
    }
}