class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int sum = 0;
        int[][] result = new int[arr1.length][arr1[0].length]; // 배열을 생성할 땐 항상 new를 사용해줘야 함.
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr1[0].length; j++){
                sum = arr1[i][j] + arr2[i][j];
                result[i][j] = sum;
            }
        }
        return result;
    }
}