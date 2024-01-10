package thread_test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PrintThread pt = new PrintThread();
		Thread th = new Thread(pt);
		Scanner sc = new Scanner(System.in);

		System.out.println("カウントダウンを開始します");
		th.start();

		String cmd = sc.nextLine();
		if (cmd.equals("stop")) {
			pt.stopCount();
		}
	}
}
