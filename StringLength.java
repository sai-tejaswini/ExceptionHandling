package giventasks.StringLength;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import giventasks.StringArray.Stringexception;

public class StringLength {
	public static void main(String args[]) throws IOException, Stringexception, Stringlengthexception {
		
		
		int count =0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		
		int len = name.length();
		
		if(len > 15) {
			throw new Stringlengthexception("Enter name less than 15 charecters");
		}
	}
}
