package lambda_simple_refactored;

public class ThreadTestToRefactor {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			public void run() {
				System.out.println("This is a long running operation...");
			}
		});

		t.start();
	}
}
