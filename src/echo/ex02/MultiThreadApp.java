package echo.ex02;

public class MultiThreadApp {

	public static void main(String[] args) throws Exception {

		Thread thread = new DigitThread();

		thread.start();
		
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
			Thread.sleep(1000);
		}
		
	}

}
