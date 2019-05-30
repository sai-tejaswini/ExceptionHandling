package TryCatchFinally;

import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");
		int i,j,k = 0;
		int[] a = null ;

		try {
			i=sc.nextInt();
			j=sc.nextInt();
			k = i/j;
			System.out.println("k = " + k);
			a = new int[k];
			for(int x=0;x<k;x++) {
				a[x+1] = x;
				System.out.println(a[x]);
			}
			for(int x=0;x<k;x++) {
				a[x+1] = x;
				System.out.println(a[x]);
			}
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
			System.out.println(e);

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
			System.out.println(e);

		}
//		finally {
//			for(int x=0;x<k;x++) {
//				a[x+1] = x;
//				System.out.println(a[x]);
//			}
//		}
		System.out.println("Program ends");
	}
}
