package edu.macalester.cs124;

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

/*
 * File: DrawFordCircles.java
 * 
 */

public class DrawFordCircles extends GraphicsProgram {
	public void run() {
		for(int i = 0; i < 50; i++) {
			for(int q = i; q < 50; q++)
			add(drawFordCircle(i, q));
			
		}	
	}
	
	public GOval drawFordCircle(double p, double q) {
		double width = getWidth();
		double r = ((1 / (q * q)) / 2) * width;
		double startx = ((p/q) * width) - r;
		GOval circle = new GOval(startx , 0, r*2, r*2);
		return circle;
	}

}
