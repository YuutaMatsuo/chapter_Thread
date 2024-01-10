package thread_test;

import java.util.concurrent.TimeUnit;

public class PrintThread extends Thread {
	
	private boolean stop = false;
	
	public void run() {
		for (int i = 30; i > 0; i--) {
			if(stop) {
				break;
			}
			System.out.print(i + "..");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				;
			}
		}
	}
	
	// カウントダウン停止用のメソッドを作る(非推奨のtop()は使わない！）
	public void stopCount() {
		this.stop = true;	}
}
