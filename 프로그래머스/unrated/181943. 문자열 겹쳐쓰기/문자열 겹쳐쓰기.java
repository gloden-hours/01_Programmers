class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
     
        sb.replace(s, s+overwrite_string.length(), overwrite_string);
        
        return sb.toString();
    }
}