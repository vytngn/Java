public class testPalindrome {

	public static void main(String[] args) {
	
	System.out.println(isPalindrome(1234));
	}
	
	public static boolean isPalindrome(int x) {
	    String str = String.valueOf(x);
	        int start = 0;
	        int end = str.length()-1;
	        while(start < end) {
	            if(str.charAt(start) != str.charAt(end))
	               return false;
	            start++;
	            end--;
	        }
	 return true;
	}

}
