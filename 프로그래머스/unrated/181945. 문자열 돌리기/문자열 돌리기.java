import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i = 0; i <= a.length()-1; i++) {
			char result = a.charAt(i);
			System.out.println(result);
		}
    }
}