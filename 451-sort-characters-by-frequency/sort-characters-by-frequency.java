class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
        PriorityQueue<Character> maxHeap=new PriorityQueue<>((a,b)->freq[b]-freq[a]);
        for(int i=0;i<128;i++){
            if(freq[i]>0){

            maxHeap.offer((char)(i));
            }
        }
        char c;
        StringBuilder sb=new StringBuilder();
        while(!(maxHeap.isEmpty())){
            c=maxHeap.poll();
            for(int i=0;i<freq[c];i++){

            sb.append(c);
            }
        }
        return sb.toString();
    }
}