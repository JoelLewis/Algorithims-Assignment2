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
		
		GOval inner = new GOval(centerX-pixelRad(.3), centerY-pixelRad(.3), pixelDiam(.3), pixelDiam(.3));
		inner.setFilled(true);
		inner.setColor(Color.RED);
		GOval middle = new GOval(centerX-pixelRad(.65), centerY-pixelRad(.65), pixelDiam(.65),pixelDiam(.65));
		GOval outer = new GOval(centerX-pixelRad(1.0), centerY-pixelRad(1.0), pixelDiam(1.0),pixelDiam(1.0));
		outer.setFilled(true);
		outer.setColor(Color.RED);
		add (outer);
		add (middle);
		add (inner);
	}
	double pixelDiam(double radius) {
		double diam=radius*2*72;
		return diam;
	
	double pixelRad(double radius) {
		radius*72;
		return;
		
	}
	
}
