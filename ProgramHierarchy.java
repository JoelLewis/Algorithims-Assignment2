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
		double centerY = getHeight();
		double centerX = getWidth();
		
		GLabel prog = new GLabel("Program", centerX, centerY-20);
		GLabel graphProg = new GLabel("GraphicsProgram", centerX-30, centerY+10);
		GLabel consoleProg = new GLabel("ConsoleProgram", centerX, centerY+10); 
		GLabel dialogProg = new GLabel("DialogProgram", centerX+30, centerY+10);
		
		add(prog);
		add(graphProg);
		add(consoleProg);
		add(dialogProg);
}}

