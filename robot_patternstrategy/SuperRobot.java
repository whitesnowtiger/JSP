package robot_patternstrategy;

import robot_actions_interface.FlyYes;
import robot_actions_interface.MissileYes;
import robot_actions_interface.SwordLaser;

/*import robot_actions_interface.FlyYes;
import robot_actions_interface.IFly;
import robot_actions_interface.IMissile;
import robot_actions_interface.ISword;
import robot_actions_interface.MissileYes;
import robot_actions_interface.SwordLaser;*/

public class SuperRobot extends Robot{
	
	/*IFly fly;
	IMissile missile;
	ISword sword;
	
	IFly fly = new FlyYes();
	IMissile missile = new MissileYes();
	ISword sword = new SwordLaser();*/
	
	public SuperRobot() {
		// TODO Auto-generated constructor stub
		fly = new FlyYes();
		missile = new MissileYes();
		sword = new SwordLaser();
		
	}

	@Override
	public void shape() {
		// TODO Auto-generated method stub
		
			System.out.println("I am a super robot.  I have arms, legs, body and a head.");

	}
	
	
	
	/*public void actionFly() {
		System.out.println("I can fly.");
	}
	
	public void actionMissile() {
		System.out.println("I can shoot missiles.");
	}
	
	public void actionSword() {
		System.out.println("I have a laser sword.");
	}*/
	
	

}
