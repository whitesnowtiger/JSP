package thread2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest threadTest = new ThreadTest();
		threadTest.setName("A");
		threadTest.start();
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("MainClass");

	}

}
