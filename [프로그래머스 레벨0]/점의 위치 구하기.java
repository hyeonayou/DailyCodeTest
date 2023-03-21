class Solution {
    public int solution(int[] dot) {
        int answer = 0;

        for(int i = 0; i <dot.length ; i ++){
            if(dot[i] >= 0 && dot[i+1] >= 0 )
                return answer = 1;
            else if(dot[i] < 0 && dot[i+1] >= 0)
                return answer = 2;
            else if(dot[i] < 0 && dot[i+1] < 0)
                return answer = 3;
            else
                return answer = 4;
        }
        return answer;
    }
}
