package thread_sample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 処理A: 9から0までのカウントダウンをする
//		PrintingThread pt = new PrintingThread();
		
		// スレッドインスタンスを生成する（引数に並列処理をしたいクラスを渡す）
		Thread t = new Thread(new PrintingThread());
//		pt.start(); // 直接クラスをインスタンス化してもマルチスレッドにならない・・・
		t.start();
		
		// 処理B: 入力を受け付ける
		String input = new Scanner(System.in).nextLine();
	}
}
