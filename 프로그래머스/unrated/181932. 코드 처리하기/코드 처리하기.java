class Solution {
    public String solution(String code) {
        String ret = "";
        int mode = 0;
        
        for (int i = 0; i < code.length(); i++) {
			
			char[] charArray = code.toCharArray();
			
			switch (mode) {
			case 0:
				if (charArray[i]!='1') {
					if (i%2==0) ret += charArray[i];
				}else {
					mode = 1;
				}
				break;

			case 1:
				if (charArray[i]!='1') {
					if (i%2==1) ret += charArray[i];
				}else {
					mode = 0;
				}
				break;
			}
		}
        
        if ( ret.isBlank()) {
			ret = "EMPTY";
		}
        
        return ret;
    }
}