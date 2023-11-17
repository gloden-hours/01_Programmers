class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] char_array = my_string.toCharArray();
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];

            for (int j = s; j <= e; j++) {
                char tmp = ' ';
                tmp = char_array[j];
                char_array[j] = char_array[e];
                char_array[e] = tmp;

                e--;
            }

        }

        answer = String.valueOf(char_array);
        
        return answer;
    }
}