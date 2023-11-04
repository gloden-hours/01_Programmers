class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        switch (ineq) {
		case "<" :
			switch (eq) {
			case "=":
				if( n==m || n<m ) answer = 1;
				break;
			case "!":
				if ( n<m ) answer = 1;
				break;
			default:
				answer = 0;
			}
			break;

		case ">":
			switch (eq) {
			case "=":
				if( n==m || n>m ) answer = 1;
				break;
			case "!":
				if ( n>m ) answer = 1;
				break;
			default:
				answer = 0;
			}
			break;
		}
        
        return answer;
    }
}