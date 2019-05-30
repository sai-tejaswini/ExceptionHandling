import java.util.Scanner;

public class TryCatch {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 numbers ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		try {
			c = a/b;
			
		}catch(ArithmeticException e){
			System.err.println(e);
		}
	}
}