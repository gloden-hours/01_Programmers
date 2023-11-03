class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str1 = Integer.toString(a) + Integer.toString(b);
        
        return (Integer.parseInt(str1) > 2*a*b) ? Integer.parseInt(str1) : 2*a*b ;
    }
}