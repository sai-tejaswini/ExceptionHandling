class ThrowDemo {
	static void demoproc() {
		try {
			System.out.println("code is in Static void demoproc try block!");
			throw new NullPointerException("demo");
		} catch(NullPointerException e) {
			System.out.println("Catch Caught inside demoproc.");
			throw e; 
		}
	}
	public static void main(String args[]) {
		try {
			System.out.println("code is in Main try block!");
				demoproc();
		}
		catch(NullPointerException e) {
			System.out.println("Recaught: " + e);
		}
		finally{
			System.out.println("I am Free now,Code Says");
		}
	}
}