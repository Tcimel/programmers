class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min = Math.min(n, m);
        int max = Math.max(n, m);
        int result = 0;
        for(int i=1; i<=min; i++){//작은 수까지만 공약수를 검사하면 되니까,
            if(n%i==0&&m%i==0){
                result = i;
            }
        }
        
        while(true){
            if(max%n==0&&max%m==0){
                break;
            }
            max++;
        }
        
        answer[0] = result;
        answer[1] = max;
        
        return answer;
    }
}
