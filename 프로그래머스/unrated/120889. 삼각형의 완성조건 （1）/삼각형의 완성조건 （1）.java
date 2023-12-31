import java.util.*;

class Solution {
    public int solution(int[] sides) {
        Arrays.parallelSort(sides);
        return sides[2] < sides[0] + sides[1] ? 1 : 2;
    }
}