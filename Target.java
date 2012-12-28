/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		/* You fill this in. */
		double centerY = getHeight()/2.0;
		double centerX = getWidth()/2.0;
		
		GOval inner = new GOval(centerX, centerY, pixelRadius(.3), pixelRadius(.3));
		add(inner);
		GOval middle = new GOval(centerX, centerY, pixelRadius(.65),pixelRadius(.65));
		add (middle);
		GOval outer = new GOval(centerX, centerY, pixelRadius(1.0),pixelRadius(1.0));
		add (outer);
	}
	double pixelRadius(double radius) {
		double diam=radius*2*72;
		return diam;
	}
	
}
