class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        char[] char_array = my_string.toCharArray();
		for (int i = 0; i < index_list.length; i++) {
			answer += char_array[index_list[i]];
		}
        
        return answer;
    }
}