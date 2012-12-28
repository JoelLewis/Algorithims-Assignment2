/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	public void run() {
		double centerY = getHeight()/2.0;
		double centerX = getWidth()/2.0;
		
		GLabel prog = new GLabel("Program", centerX, centerY-50);
		GLabel graphProg = new GLabel("GraphicsProgram", centerX-150, centerY+30);
		GLabel consoleProg = new GLabel("ConsoleProgram", centerX, centerY+30); 
		GLabel dialogProg = new GLabel("DialogProgram", centerX+150, centerY+30);
		
		add(prog);
		add(graphProg);
		add(consoleProg);
		add(dialogProg);
}}

