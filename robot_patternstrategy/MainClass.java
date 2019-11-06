package robot_patternstrategy;

import robot_actions_interface.FlyYes;
import robot_actions_interface.MissileYes;
import robot_actions_interface.SwordLaser;

public class MainClass {

	public static void main(String[] args) {
		
		
		System.out.println("Make a SuperRobot.");
		Robot superRobot = new SuperRobot();
		superRobot.shape();
		superRobot.actionWalk();
		superRobot.actionRun();
		superRobot.setFly(new FlyYes());
		superRobot.actionFly();
		superRobot.setMissile(new MissileYes());
		superRobot.actionMissile();
		superRobot.setSword(new SwordLaser());
		superRobot.actionSword();
		
		
	}
}
