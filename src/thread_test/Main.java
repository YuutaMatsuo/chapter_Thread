package thread_test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Thread th = new Thread(new PrintThread());
		Scanner sc = new Scanner(System.in);
		
		System.out.println("カウントダウンを開始します");
		th.start();
		
		String cmd = sc.nextLine();
		if(cmd.equals("stop")) {
			try {
			th.wait();
			} catch(InterruptedException e) {
				System.out.println("処理を一時停止します");
			}
		}
	}
}
