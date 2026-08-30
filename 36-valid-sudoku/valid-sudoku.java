class Solution {
    public boolean isValidSudoku(char[][] board) {

        int[] seenRow = new int[9];
        int[] seenColumn = new int[9];
        int[] seenBox = new int[9];

        int no,n,bit;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j]=='.')continue;
                else n=board[i][j]-'1';

                no=(i/3)*3+(j/3);

                bit=1<<n;

                if((seenRow[i]&bit)!=0 || (seenColumn[j]&bit)!=0 || (seenBox[no]&bit)!=0){
                    return false;
                }

                seenRow[i]|=bit;
                seenColumn[j]|=bit;
                seenBox[no]|=bit;
            }
        }
        return true;
    }
}