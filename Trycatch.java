package Trycatch;

public class Trycatch {
	public static void main(String args[]) {
		try {
			int i = 2;
			int j = 0;
			int k = i/j;
			System.out.println("K  = " + k);
		}catch(ArithmeticException ae) {
			 System.out.println(ae);
			System.out.println("Hello catch");
			ae.printStackTrace();
		}
	}
}
