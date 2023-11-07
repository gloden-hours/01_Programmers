import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < num_list.length; i++) {
            array.add(num_list[i]);
        }

        int last = array.get(array.size()-1);
        int before = array.get(array.size()-2);
        array.add(last>before? last-before : last*2);
        
        int[] answer = array.stream().mapToInt(Integer::intValue).toArray();

        
        return answer;
    }
}