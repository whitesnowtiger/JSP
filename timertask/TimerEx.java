package timertask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx {
	
	public TimerEx() throws InterruptedException {
		// TODO Auto-generated constructor stub
		
		System.out.println("^^");
		Timer timer = new Timer(true);
		TimerTask t1 = new ExTimerTask1();
		TimerTask t2 = new ExTimerTask2();
		
		timer.schedule(t1, 2000);  //execute after 2 sec
		timer.schedule(t2, 10000); //after 10sec
		
		Thread.sleep(11000);
		System.out.println("**");
	}

}
