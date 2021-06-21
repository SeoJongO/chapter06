package echo.ex05;

public class MultiThread {

	public static void main(String[] args) throws Exception {
		
		Thread thread1 = new Thread(new DigitRunableImpl());
		Thread thread2 = new Thread(new UpperRunableImpl());
		Thread thread3 = new Thread(new LowerRunableImpl());
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
