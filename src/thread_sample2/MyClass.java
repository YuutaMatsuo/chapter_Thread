package thread_sample2;

import java.util.concurrent.TimeUnit;

public class MyClass implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				;
			}
		}
	}
}
