package TryCatchCatch;

import java.util.Scanner;

public class TryCatchCatch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers ");;
		try {
			int i=sc.nextInt();
			int j=sc.nextInt();
			int k = i/j;
			System.out.println(" k = " + k);
			int[] a = new int[k];
			for(int x=0;x<k;x++) {
				a[x+1] = x;
				System.out.println(a[x]);
			}
		}catch(ArithmeticException e) {
			System.out.println("ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
	}
}
