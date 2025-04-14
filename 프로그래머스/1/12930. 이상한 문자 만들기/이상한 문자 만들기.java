class Solution {
    public String solution(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){ // " " -> String, 문자로 비교하려면 ' '
                count=0;
                sb.append(s.charAt(i));
            }else{
                if(count==0||count%2==0){
                sb.append(Character.toUpperCase(s.charAt(i))); //문자 하나를 대문자로 변환시켜줘야 하니까 String의 uppercase말고 character의 uppercase사용
                }else{
                    sb.append(Character.toLowerCase(s.charAt(i)));
                }
                count++;
            }
            
        }
        return sb.toString();
    }
}