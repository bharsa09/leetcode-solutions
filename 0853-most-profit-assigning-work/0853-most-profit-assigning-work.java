class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        //zip difficulty and profit as job

        int N=difficulty.length;

        int[][] job=new int[N][2];

        for(int i=0;i<N;i++){
            job[i][0]=difficulty[i];
            job[i][1]=profit[i];
        }

        //sort job;

        Arrays.sort(job,new Comparator<int []>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });

        int totalProfit=0;

        Arrays.sort(worker);
        
        int j=0;
        int bestPaySoFar=0;

        for(int i=0;i<worker.length;i++){
            int workerDiff=worker[i];

            while(j<job.length && workerDiff>=job[j][0]){
                if(bestPaySoFar<job[j][1]){
                    bestPaySoFar=job[j][1];
                }
                j++;
            }
            totalProfit +=bestPaySoFar;

        }


        return totalProfit;
        
    }
}