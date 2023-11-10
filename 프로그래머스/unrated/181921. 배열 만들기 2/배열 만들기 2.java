import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>(); //값을 담아줄 List

        for (int i = l; i <= r; i++) {
            String num = i + "";
            int cnt = 0;

            for (int j = 0; j < num.length(); j++) {
                if (num.charAt(j)==48 || num.charAt(j)==53) { //48이 0, 53이 5
                    cnt++;
                }
            }

            if(cnt==num.length()) { //5나 0일때
                list.add(i);
            }
        }

        int[] answer = list.stream().mapToInt(i->i).toArray();

        if (list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;
    }
}