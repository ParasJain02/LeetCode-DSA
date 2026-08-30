class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] seenRow = new boolean[9][9];
        boolean[][] seenColumn = new boolean[9][9];
        boolean[][] seenBox = new boolean[9][9];
        int no,n;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')continue;
                else n=board[i][j]-'0';

                no=(i/3)*3+(j/3);

                if(seenRow[i][n-1]==true)return false;
                else seenRow[i][n-1]=true;
                if(seenColumn[j][n-1]==true)return false;
                else seenColumn[j][n-1]=true;
                if(seenBox[no][n-1]==true)return false;
                else seenBox[no][n-1]=true;
            }
        }
        return true;
    }
}