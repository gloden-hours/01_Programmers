class Solution {
    public String[] solution(String my_string) {
        String[] space = my_string.split(" ");
        String[] answer = new String[space.length];

        for (int i = 0; i < space.length; i++) {
            answer[i] = space[i];
        }
        
        return answer;
    }
}