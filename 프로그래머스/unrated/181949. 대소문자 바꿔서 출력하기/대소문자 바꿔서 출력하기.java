import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] charArray = a.toCharArray(); 

        for (int i = 0; i < charArray.length; i++) {
        	char ch = charArray[i];
			if(charArray[i] >= 97 && charArray[i] <= 122) { //소문자
				charArray[i] = Character.toUpperCase(ch);	
			}else if(charArray[i] >= 65 && charArray[i] <= 90) { //대문자 65~90
				charArray[i] = Character.toLowerCase(ch);
			}
		}
        
        System.out.println(String.valueOf(charArray));
    }
}