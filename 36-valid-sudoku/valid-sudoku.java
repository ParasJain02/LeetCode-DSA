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

                if(!(n<=9 && n>0))return false;
                if(i<3){
                    if(j<3){
                        no=0;
                    }else if(j<6){
                        no=1;
                    }else{
                        no=2;
                    }
                }
                else if(i<6){
                    if(j<3){
                        no=3;
                    }else if(j<6){
                        no=4;
                    }else{
                        no=5;
                    }
                }
                else{
                    if(j<3){
                        no=6;
                    }else if(j<6){
                        no=7;
                    }else{
                        no=8;
                    }
                }

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