class Solution {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
			char[] char_array = number.toCharArray();
			answer += char_array[i]-'0';
		}
        
        return answer%9;
    }
}