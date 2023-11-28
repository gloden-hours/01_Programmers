import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            switch (n) {
                case 1 :
                    if (i<=slicer[1]) list.add(num_list[i]);
                    break;
                case 2 :
                    if (slicer[0] <= i) list.add(num_list[i]);
                    break;
                case 3 :
                    if (slicer[0] <= i && i <= slicer[1]) list.add(num_list[i]);
                    break;
                case 4 :
                    if (slicer[0] <= i && i <= slicer[1]) {
                        list.add(num_list[i]);
                        i += (slicer[2]-1);
                    }
                    break;
            }
        }

        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}