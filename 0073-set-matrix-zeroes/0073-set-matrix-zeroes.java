class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int col[]=new int[matrix[0].length];
        int row[]=new int[matrix.length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    col[j]=1;
                    row[i]=1;
                    
                }
             }
        }
        for(int i=0;i<matrix.length;i++)
        {
            if(row[i]==1)
            {
               for(int j=0;j<matrix[i].length;j++)
               {
                   matrix[i][j]=0;
               }
                
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            if(col[i]==1)
            {
               for(int j=0;j<matrix.length;j++)
               {
                   matrix[j][i]=0;
               }
                
            }
        }

    }}
        
       