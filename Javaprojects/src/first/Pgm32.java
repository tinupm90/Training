package first;

public class Pgm32 {
	public Pgm32(String s) {
		// TODO Auto-generated constructor stub
		String s1=s.toUpperCase();
		int a=s1.length();
		int i;
		String rev="";
		for(i=a-1;i>=0;i--) {
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev)) {
			System.out.println(s1+ " is Palindrome");
		}else {
			System.out.println(s1+ " is NotPalindrome");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm32 p=new Pgm32("java");
		Pgm32 p1=new Pgm32("malayalam");
		

	}

}
