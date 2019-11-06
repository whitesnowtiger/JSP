package thread1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadTest threadTest = new ThreadTest();
		Thread thread = new Thread(threadTest, "A");
		thread.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");
		
	}

}
