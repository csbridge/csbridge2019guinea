import acm.program.*;
import acm.graphics.*;
import acm.util.*;

import java.awt.Color;
import java.awt.event.*;
import java.util.ArrayList;

public class BouncingBalls extends GraphicsProgram {
	private static final double BALL_SIZE = 20;
	private static final double N_BALLS = 50;
	
	private ArrayList<Ball> ballList;
	private RandomGenerator rg = new RandomGenerator();
	
	public void run() {
		createBalls();
		while(true) {
			animateBalls();
			pause(10);
		}
	}

	private void animateBalls() {
		for(int i = 0; i < N_BALLS; i++) {
			Ball ball = ballList.get(i);
			GOval oval = ball.getOval();
			if(oval.getX() > getWidth() - BALL_SIZE || oval.getX() < 0) {
				ball.setVx(-ball.getVx());
			}
			if(oval.getY() > getHeight() - BALL_SIZE || oval.getY() < 0) {
				ball.setVy(-ball.getVy());
			}
			oval.move(ball.getVx(), ball.getVy());
		}
	}

	private void createBalls() {
		ballList = new ArrayList<Ball>();
		for(int i = 0; i < N_BALLS; i++) {
			Ball ball = new Ball();
			
			ball.setVx(rg.nextDouble(1, 3));
			ball.setVy(rg.nextDouble(1, 3));
			
			double x = rg.nextDouble(0, getWidth() - BALL_SIZE);
			double y = rg.nextDouble(0, getHeight()- BALL_SIZE);
			ball.setOval(new GOval(x, y, BALL_SIZE, BALL_SIZE));
			ball.getOval().setFilled(true);
			ball.getOval().setColor(rg.nextColor());
			add(ball.getOval());
			
			ballList.add(ball);
		}
	}

	
}
