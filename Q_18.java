
/*
	 * Q:18
	WAJP to check array is a Palindrome array or not.
	        Return true or false accordingly.

     Original array : 10 20 30 40 30 20 10
		  Output   :  true   or   false

				*/


public class Q_18 {

	public static void main(String [] args) {
		int [] a = {10,20,30,40,30,20,10};

		System.out.print("Original Array : ");
		for(int x : a) {
			System.out.print(x+" ");
		}

		boolean result = isPalindromic(a);
		System.out.println("\nis Palindromic Array : " + result);
	}


        public static boolean isPalindromic(int [] a) {
            int start = 0; int end = a.length-1;
            while(start < end) {

                if(a[start] != a[end])
                    return false;
                start++; end--;
            }
            return true;
	}






}