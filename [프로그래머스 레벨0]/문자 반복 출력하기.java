class Solution {
    public String solution(String my_string, int n) {

        String sum = "";
        for(int i = 0; i < my_string.length(); i++){
            for(int j = 1; j <= n; j++) {
                sum += my_string.charAt(i);
            }
        }
        return sum;
    }ß
}