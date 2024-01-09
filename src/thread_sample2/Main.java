package thread_sample2;

import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		// データ型に「Runnable」を指定すると並列処理できない
		Thread th = new Thread(new MyClass());
		th.start();
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				;
			}
		}
	}
}
