class Solution {
    public String solution(String myString) {
        String answer = "";
        
        char[] char_array = myString.toCharArray();

        for (int i = 0; i < char_array.length; i++) {
            if(char_array[i] < 108) {
                char_array[i] = 108;
            }
            answer += char_array[i];
        }
        
        return answer;
    }
}