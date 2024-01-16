package thread_game;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		// インスタンスを生成
		Scanner sc = new Scanner(System.in);
		Timer timer = new Timer();
		Thread t1 = new Thread(timer);
		
		String input;
		String word1 = "生麦生米生卵";
		// ゲームスタート
		gameMessage();
		t1.start();
		
		while(timer.isTimeUp() != true) {
		System.out.println(word1);
		System.out.print(">>");
		input = sc.nextLine();
		
	}

	public static void gameMessage() {
		System.out.println("画面に表示される文字を入力してね");
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			;
		}
		System.out.println("それじゃ、はじめるよ！");
		System.out.println();
	}
}
