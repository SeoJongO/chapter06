package echo.ex03;

public class DigitThread extends Thread {

	@Override
	public void run() {

		// 0~9 출력
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
