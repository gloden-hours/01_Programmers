class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String reverse = my_string.substring(s, e+1);
        StringBuffer sb = new StringBuffer(reverse);
        
        reverse = sb.reverse().toString();
        answer = my_string.replaceAll(my_string.substring(s, e+1), reverse);
        
        return answer;
    }
}