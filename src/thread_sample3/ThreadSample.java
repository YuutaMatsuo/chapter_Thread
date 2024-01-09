package thread_sample3;

public class ThreadSample implements Runnable {

	static int total = 0; // 残高

	public void run() {
		for (int i = 0; i < 1000; i++) {
			add("1000");
		}
	}

	// 入金をするメソッド
	public synchronized static void add(String num) {
		System.out.printf("入金前: %,8d\n",total);
		int addResult = total + (Integer.parseInt(num));
		total = addResult;
		System.out.printf("入金後: %,8d\n",total);
	}
}
