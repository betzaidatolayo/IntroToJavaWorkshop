import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class graffiti {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		// r2d2.moveTo(00,0);
		r2d2.setPenColor(Color.BLUE);
		r2d2.setSpeed(500);
		r2d2.penDown();
		r2d2.move(500);
		r2d2.turn(90);
		r2d2.move(400);
		r2d2.turn(90);
		r2d2.move(500);
		r2d2.turn(90);
		r2d2.move(800);
		r2d2.turn(90);
		r2d2.move(500 / 2);
		r2d2.turn(90);
		r2d2.move(800);
		r2d2.turn(-90);
		r2d2.move(500 / 2);
        r2d2.turn(-810);
        r2d2.move(830);
	r2d2.turn(500);
	
	
	
	
	
	
	
	}








}
