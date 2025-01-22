package assignment0;

import support.assignment0.RobotMotionAdapter;

public class RobotInstructions  {

	/*
	 * Below you see a method called "act".
	 * It has one parameter, called "support.robot".
	 * For now, the way in which the code below fits into what you see on
	 * the screen will seem mysterious.  That's OK.
	 * 
	 * For now, please accept that the instructions below cause the support.robot to
	 * move forward, turn left, or turn right.
	 */
	public void act(RobotMotionAdapter robot) {
		
		/**
		 * Each of the following lines of code executes in turn.  The
		 * first line causes the support.robot to move forward 60 "pixels".  A pixel is
		 * a measurement of distance on a computer screen.
		 * 
		 * The second line causes the support.robot to turn left.  Based on what you see,
		 * what does "90" represent?
		 * 
		 * Run the program as instructed in the lab write-up and observe how the support.robot
		 * moves in response to the code you see below.
		 * 
		 * You will add instructions at the end of the code to cause the support.robot to move
		 * as you desire.
		 */
		robot.turnLeft(90);
		robot.forward(90);
		robot.turnRight(90);
		robot.forward(120);
		robot.turnRight(90);
		robot.forward(60);
		//begin stem
		robot.turnLeft(90);
		robot.forward(98);
		//first leaf
		robot.turnLeft(45);
		robot.forward(30);
		robot.turnLeft(30);
		robot.forward(25);
		robot.turnRight(30);
		robot.forward(40);
		robot.turnRight(160);
		//half leaf
		robot.forward(40);
		robot.turnRight(20);
		robot.forward(55);
		robot.turnLeft(135);
		//center stem now up
		robot.forward(60);
		//second leaf
		robot.turnLeft(45);
		robot.forward(30);
		robot.turnLeft(30);
		robot.forward(25);
		robot.turnRight(30);
		robot.forward(40);
		robot.turnRight(160);
		robot.forward(40);
		robot.turnRight(20);
		robot.forward(55);
		robot.turnLeft(135);
		//third leaf
		robot.turnRight(45);
		robot.forward(30);
		robot.turnRight(30);
		robot.forward(25);
		robot.turnLeft(30);
		robot.forward(40);
		robot.turnLeft(160);
		//half leaf
		robot.forward(40);
		robot.turnLeft(20);
		robot.forward(55);
		robot.turnLeft(45);
		robot.forward(160);
		//rest of pot
		robot.turnLeft(90);
		robot.forward(90);
		robot.turnRight(90);
		robot.forward(120);
		robot.turnRight(90);
		robot.forward(90);
		
	}

}
