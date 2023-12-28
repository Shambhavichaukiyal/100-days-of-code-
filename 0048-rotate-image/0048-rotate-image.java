class Solution {
    public void rotate(int[][] matrix) {
       int temp=0;
        int m[]=new int[matrix.length];
        for (int i = 0; i < matrix.length/2; i++) 
        {
            m=matrix[i];
            matrix[i]=matrix[matrix.length-i-1];
            matrix[matrix.length-i-1]=m;
            }
        for (int i = 0; i < matrix.length; i++) 
        {
            for (int j = i; j < matrix.length; j++) 
        {
        if(i!=j)
        {
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
            }}
        }
    }

