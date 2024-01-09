package thread_test;

import java.util.concurrent.TimeUnit;

public class PrintThread extends Thread {
	public void run() {
		for (int i = 30; i > 0; i--) {
			System.out.print(i + "..");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				;
			}
		}
	}
}
