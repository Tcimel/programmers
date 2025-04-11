class Solution {
    public boolean solution(String s) {
        int length = s.length();
        
        if(length==4 || length==6){
            for(int i=0; i<length; i++){
                if(!Character.isDigit(s.charAt(i))){ //isDigit : 숫자여부 판별하여 true, false 반환
                    return false;
                }
            }
            return true;
        }else{
            return false;
        }
    }
}