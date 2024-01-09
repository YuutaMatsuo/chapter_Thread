package thread_sample;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 処理A: 9から0までのカウントダウンをする
		PrintingThread pt = new PrintingThread();
		pt.countDown();
		
		// 処理B: 入力を受け付ける
		String input = new Scanner(System.in).nextLine();
	}
}
