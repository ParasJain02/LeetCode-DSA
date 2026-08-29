class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        

      
        
        if(Math.abs(target[0]-source[0])==Math.abs(target[1]-source[1])){
            return 1;
        }

        if(((source[0]+source[1])%2==0) != ((target[0]+target[1])%2==0)){
             return -1;  
        }

        
        return 2;
        
        
        
    }
}