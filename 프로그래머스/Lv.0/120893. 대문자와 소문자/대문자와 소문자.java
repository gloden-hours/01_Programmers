class Solution {
    public String solution(String my_string) {
        char[] list = my_string.toCharArray();

        for (int i = 0; i < list.length; i++) {
            if(list[i] < 97) list[i] += 32;
            else list[i] -= 32;
        }
        
        return String.valueOf(list);
    }
}