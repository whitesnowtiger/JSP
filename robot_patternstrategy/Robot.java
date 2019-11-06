package robot_patternstrategy;

import robot_actions_interface.IFly;
import robot_actions_interface.IMissile;
import robot_actions_interface.ISword;

public abstract class Robot {
	
	IFly fly;
	IMissile missile;
	ISword sword;
	
	public Robot() {
		// TODO Auto-generated constructor stub
	}
	
	public void actionWalk() {
		System.out.println("I can walk.");
	}
	
	public void actionRun() {
		System.out.println("I can run.");
	}
	
	
	public abstract void shape();
	
	/*public abstract void actionFly();
	public abstract void actionMissile();
	public abstract void actionSword();*/
	
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}
	
	public void setMissile(IMissile missile) {
		this.missile = missile;
	}
	
	public void setSword(ISword sword) {
		this.sword = sword;
	}
	
	
	
	public void actionFly() {
		this.fly.fly();
	}
	
	public void actionMissile() {
		this.missile.missile();
	}
 		
	public void actionSword() {
		this.sword.sword();
	}
	
	
}
