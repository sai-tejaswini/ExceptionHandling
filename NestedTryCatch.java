package NestedTryCatch;

import java.util.Scanner;

public class NestedTryCatch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4};
		int j,d,c;
		try {
			try {
				System.out.println("enter index value to get element ");
				c = sc.nextInt();
				System.out.println(a[c]);
				
			}
			catch(ArrayIndexOutOfBoundsException ai) {
				System.out.print("ArrayIndexOutOfBoundsException");
			}
			try {
				System.out.println("Enter element to divide");

				j = sc.nextInt();
				d = 100/j;
				System.out.println(d);
				
			}
			catch(ArithmeticException ai) {
				System.out.print("ArithmeticException");
			}
			
			a[0]=(Integer) null;
			System.out.println(a[0]);
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
