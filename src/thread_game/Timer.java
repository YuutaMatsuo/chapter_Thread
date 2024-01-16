package thread_game;

import java.util.concurrent.TimeUnit;

public class Timer extends Thread {
	public static final int defaultTime = 15;
	private int time;
	private boolean timeUp = false;

	public Timer() {
		this.time = defaultTime;
	}

	public void run() {
		while (this.time > 0) {
			if (this.time <= 3) {
				System.out.print(this.time + " ");
			}
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				;
			}
			this.time -= 1;
		}
		timeUp = true;
	}

	public void resetTime() {
		this.time = defaultTime;
	}

	public boolean isTimeUp() {
		return timeUp;
	}
}
