class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        for (int i = 0; i < numLog.length; i++) {
            if (i == numLog.length-1) break;
            switch (numLog[i+1] - numLog[i]) {
                case 1: answer += "w"; break;
                case -1: answer += "s"; break;
                case -10: answer += "a"; break;
                case +10: answer += 'd'; break;
            }
        }
        
        return answer;
    }
}