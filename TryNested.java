package Trynested;

import java.util.Scanner;

public class TryNested {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		try {
			try {
				try {
					int a[] = {1,2,3,4};
					System.out.println("enter index value to get element ");
					int c = sc.nextInt();
					System.out.println(a[c]);
					System.out.println("Enter element to divide");
					int j = sc.nextInt();
					int d = a[c]/j;
					System.out.println(d);
					a[0]=(Integer) null;
					System.out.println(a[0]);
				}
				catch(ArrayIndexOutOfBoundsException ai) {
					System.out.print("ArrayIndexOutOfBoundsException");
				}
			}
			catch(ArithmeticException ai) {
				System.out.print("ArithmeticException");
			}
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
	}
}
