class Solution {
    public int finalValueAfterOperations(String[] operations) {

        int x=0;

        for(int i=0;i<operations.length;i++){
            String s=operations[i];
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='+'){
                    x++;
                    break;
                }else if(s.charAt(j)=='-'){
                    x--;
                    break;
                }
            }
        }
        return x;
        
    }
}