class Solution {
    public int equalPairs(int[][] grid) {
       
        int count=0;
        int n = grid.length;
         int[][] transpose = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpose[j][i] = grid[i][j]; 
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boolean match =true;
                for(int k=0;k<n;k++){
                    if(grid[i][k] != transpose[j][k]){
                        match = false;
                    }
                }
                if(match){
                    count++;
                }
            }
        }return count;
    }
}