package giventasks.LessCount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LessCount {
	public static void main(String args[]) throws NumberFormatException, IOException, LessCountexception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 numbers");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		int d = a+b+c;
		if(d>100) {
			throw new LessCountexception("Please enter the numbers, which total is below 100");
		}
	}
}
