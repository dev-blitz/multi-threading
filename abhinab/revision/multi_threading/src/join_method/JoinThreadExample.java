package join_method;

	/**
 * this is a demonstration of the <em>.join()</em> method
 * the code below demonstrates how <em>.join()</em> changes the behaviour by
 * and also demonstrates <em>thread-priority</em>
 * if we comment the join method then the print statement
 * will execute first.
	 * <br>
	 * <br>
 * since main-thread is initializing all the threads,
 * therefore it has access to the CPU and thus has the
 * most priority.
	 * <br>
	 * <br>
 * But if we use join, then we are telling the main-thread
 * to join the path of execution of 'Thread-I'
 */
public class JoinThreadExample {
	public static void main(String[] args) throws InterruptedException {
		Thread one = new Thread(() -> {
			for (int i =0; i< 5; i++) {
				System.out.println(Thread.currentThread().getName() + " i: " + i);
			}
		}, "Thread-I");

		Thread two = new Thread(() -> {
			for (int i = 0; i < 25; i++) {
				System.out.println(Thread.currentThread().getName() + " i: " + i);
			}
		}, "Thread-II");

		one.start();
		two.start();
		one.join();
		System.out.println("done with thread-execution...");
	}
}
