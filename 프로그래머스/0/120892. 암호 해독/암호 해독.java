class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] cipher_array = cipher.toCharArray();

        for (int i = 1; i < cipher_array.length+1; i++) {
            if(i % code == 0) {
                answer += cipher_array[i-1];
            }
        }
        
        return answer;
    }
}