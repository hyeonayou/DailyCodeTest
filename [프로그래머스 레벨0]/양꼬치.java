class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int x = n / 10;
        if(x > 0 ){
            answer = (12000 *n) + (2000*k) - x *2000 ;
        }
        else{
            answer = (12000*n) + k*2000;
        }
        return answer;
    }
}
