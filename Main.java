class Solution {
   static void transpose(int[][] matrix)
   {
      int n=matrix.length;
      for(int i=0;i<n;i++)
      {
         for(int j=0;j<i;j++)
         {
            int temp=matrix[j][i];
            matrix[j][i]=matrix[i][j];
            matrix[i][j]=temp;

         }
      }

   }
   public void rotate(int[][] matrix) {
       transpose(matrix);
       for(int i=0;i<matrix.length;i++)
       {
          int low=0;
          int high=matrix.length-1;
          while(low<high)
          {
             int temp = matrix[i][low];
             matrix[i][low]=matrix[i][high];
             matrix[i][high]=temp;
          }
       }
   }
}