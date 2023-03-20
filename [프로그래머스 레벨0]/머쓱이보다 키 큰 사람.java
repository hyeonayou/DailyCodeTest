class Solution {
    public int solution(int[] array, int height) {

        int temp = 0;

        for(int i : array){
            if(i > height ) temp++;
        }
        return temp;
    }
}