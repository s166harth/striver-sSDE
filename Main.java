class Solution {
   public void setZeroes(int[][] matrix) {
     Boolean bool = false;
     int r = matrix.length;
     int c= matrix[0].length;
     for(int i=0;i<r;i++)
     {
         for(int j=0;j<c;j++)
         {
            if(matrix[i][j]==0)
            {
               matrix[i][0]=-1;
               matrix[0][j]=-1;
            }
         }
        
          
     }
     for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
        {
           if(matrix[i][j]==-1)
           {
              matrix[i][j]=0;
           }
        }
     }
       
   }
}