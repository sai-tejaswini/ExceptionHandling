package giventasks.StringArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringArray {
	public static void main(String args[]) throws IOException, Stringexception {
		String names[] = {"sai" , "tejaswini" , "jaya" , "sindhu" , "sowji" , "mounica", "krishna"};
		int len = names.length;
		int count =0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for(int i=0 ; i<len ; i++,count++) {
			if(str.equals(names[i])) {
				System.out.println("You are enrolled");
				break;
			}
		}
		if(count == len) {
			throw new Stringexception();
		}
		
	}
}
