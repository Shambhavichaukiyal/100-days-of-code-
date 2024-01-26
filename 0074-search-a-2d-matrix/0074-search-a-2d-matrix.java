class Solution {
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int row=matrix.length;
        int r=0;
        int column=matrix[0].length;
        int l=row*column-1;
        while(r<=l)
        {
            int mid=r+(l-r)/2;
           int mat= matrix[mid/column][mid%column];
            if(mat==target)
            {
                return true;
            }
            else if(mat<target)
            {
                r=mid+1;
            }
            else
            {
                l=mid-1;
            }
        }
        return false;
    }}
        