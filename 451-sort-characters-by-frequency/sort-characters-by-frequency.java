class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[128];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }

        List<Character>[] bucket=new List[s.length()+1];
        for(int i=0;i<128;i++){
            if(freq[i]>0){
                int f=freq[i];
                if(bucket[f]==null){
                    bucket[f]=new ArrayList<>();
                }
                bucket[f].add((char) i);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int f = bucket.length - 1; f > 0; f--) {
            if (bucket[f] != null) {
                for (char c : bucket[f]) {
                    for (int i = 0; i < f; i++) {
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
    }
}