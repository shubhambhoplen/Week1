package Day4;

class ThreadA extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A with i = " + (1 * i));
			if (i == 2) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.err.println("Exception occured");
					break;
				}
			}
		}
		System.out.println("Exiting from Thread A ...");
	}
}

class ThreadB extends Thread {
	public void run() {
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B with j = " + (10 * j));
			if (j == 3) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.err.println("Exception occured");
					break;
				}
			}
		}
		System.out.println("Exiting from Thread B ...");
	}
}

class ThreadC extends Thread {
	public void run() {
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C with k = " + (100 * k));
			if (k == 4) {
				try {
					throw new Exception();
				} catch (Exception e) {
					System.err.println("Exception occured");
					break;
				}
			}
		}
		System.out.println("Exiting from Thread C ...");
	}
}

public class Asignment1 {
	public static void main(String args[]) {
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadC c = new ThreadC();
		a.start();
		b.start();
		c.start();
		System.out.println("... Multithreading is over ");
	}
}