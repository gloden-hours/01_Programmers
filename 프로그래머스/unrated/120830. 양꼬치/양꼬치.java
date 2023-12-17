class Solution {
    public int solution(int n, int k) {
        for (int i = 1; i <= n; i++) {
			if (i % 10 == 0) {
				k -= 1;
			}
		}
        
        return (n*12000)+(k*2000);
    }
}