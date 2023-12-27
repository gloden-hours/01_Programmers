class Solution {
    public int solution(String str1, String str2) {
        str1 = str1.replace(str2, " ");
        
        return str1.contains(" ") ? 1 : 2;
    }
}