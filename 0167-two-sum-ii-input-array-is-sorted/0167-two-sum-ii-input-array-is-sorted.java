class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] res=new int[2];
        res[0]=-1;
        res[1]=-1;
        

        for(int i=0;i<numbers.length;i++){

            //why i+1??
            //because array is sorted and and complement of that number will find earlier
            int low=i+1;
            int high=numbers.length-1;


            while(low<=high){
            
                int mid=(low+high)/2;

                if(numbers[mid]==target-numbers[i]){
                    res[0]=i+1;
                    res[1]=mid+1;
                    return res;
                }else if(numbers[mid]>target-numbers[i]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }

            }

        }
        return res;
        
    }

}