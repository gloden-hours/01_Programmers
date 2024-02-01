import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {  
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 0; i < delete_list.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(j) == delete_list[i]){
                    list.remove(list.get(j));
                }
            }
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}