import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i];
            int num = Integer.parseInt(str.substring(s, s+l));
            if (k < num) list.add(num);
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}