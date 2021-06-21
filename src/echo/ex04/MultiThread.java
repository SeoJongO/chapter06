package echo.ex04;

public class MultiThread {

	public static void main(String[] args) throws Exception {
		
		Thread thread = new Thread(new DigitRunableImpl());
		
		thread.run();
		
	}

}
