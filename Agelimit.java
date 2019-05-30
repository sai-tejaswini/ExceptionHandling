package giventasks.Agelimit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Agelimit {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			int age = Integer.parseInt(br.readLine());
			if(age < 18)
			{
				throw new AgeException();
			}
			else {
				System.out.println("You are eligible ");
			}
		}catch(AgeException ie) {
			System.out.println("Access denied - You must be at least 18 years old.");
		}
	}
}
