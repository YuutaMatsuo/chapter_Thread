package thread_sample;

import java.util.concurrent.TimeUnit;

// 並列処理に対応するクラスとして宣言する
// Threadクラスを継承する(またはRunnableインタフェースを実装する)
public class PrintingThread extends Thread {
	// カウントダウンするメソッド
//	public void countDown() {
	// 並列処理を行いたい部分
	public void run() { // オーバーライド
		for (int i = 9; i >= 0; i--) {
			System.out.print(i + "..");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				;
			}
		}
	}
}
