class Solution {
    public int solution(String t, String p) {
        int size = t.length()-p.length();
        int count = 0;
        for(int i=0; i<size+1; i++){
            if(Long.parseLong(t.substring(i,i+p.length()))<=Long.parseLong(p)){
                count++;
            }
        }
        return count;
    }
}