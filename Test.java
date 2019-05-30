package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
	public static void main(String args[]) throws IOException {
		
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(in);

		String b = br.readLine();
		//System.out.println("2");

			int a = Integer.parseInt(br.readLine());
			//System.out.println("1");

			String c = br.readLine();
			//System.out.println("3");
		//	System.out.println("hello");

			System.out.println(a + " " + b + " " + c);
		
	}
}
