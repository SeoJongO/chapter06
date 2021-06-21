package echo.ex03;

public class MultiThreadApp {

	public static void main(String[] args) throws Exception {

		Thread thread1 = new DigitThread();
		Thread thread2 = new UpperCase();
		Thread thread3 = new LowerCase();

		thread1.start();
		thread2.start();
		thread3.start();

	}

}
