package giventasks.Agelimit;

public class AgeException extends Exception {

	AgeException(){
		super("Access denied - You must be at least 18 years old.");
	}
}
