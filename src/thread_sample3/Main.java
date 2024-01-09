package thread_sample3;

public class Main {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadSample());
		Thread t2 = new Thread(new ThreadSample());
		
		//　入金処理
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) {
			;
		}
		System.out.printf("最終残高:%,8d\n",ThreadSample.total);
	}
}
