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
			GOval oval = ball.oval;
			if(oval.getX() > getWidth() - BALL_SIZE || oval.getX() < 0) {
				ball.vx = - ball.vx;
			}
			if(oval.getY() > getHeight() - BALL_SIZE || oval.getY() < 0) {
				ball.vy = -ball.vy;
			}
			oval.move(ball.vx, ball.vy);
		}
	}

	private void createBalls() {
		ballList = new ArrayList<Ball>();
		for(int i = 0; i < N_BALLS; i++) {
			Ball ball = new Ball();
			
			ball.vx = (rg.nextDouble(1, 3));
			ball.vy = (rg.nextDouble(1, 3));
			
			double x = rg.nextDouble(0, getWidth() - BALL_SIZE);
			double y = rg.nextDouble(0, getHeight()- BALL_SIZE);
			ball.oval = (new GOval(x, y, BALL_SIZE, BALL_SIZE));
			ball.oval.setFilled(true);
			ball.oval.setColor(rg.nextColor());
			add(ball.oval);
			
			ballList.add(ball);
		}
	}

	
}
