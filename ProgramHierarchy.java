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
		
		GLabel consoleProg = new GLabel("ConsoleProgram", centerX+100, centerY+30); 
		GLabel prog = new GLabel("Program", consoleProg.getX()+consoleProg.getWidth()/4, centerY-50);
		GLabel graphProg = new GLabel("GraphicsProgram", centerX-50, centerY+30);
		GLabel dialogProg = new GLabel("DialogProgram", centerX+250, centerY+30);
		
		add(prog);
		add(graphProg);
		add(consoleProg);
		add(dialogProg);
}}

