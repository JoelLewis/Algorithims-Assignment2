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
	/** Width of each box in pixels */
	private static final int BOX_WIDTH = 70;

/** Height of Box */
	private static final int BOX_HEIGHT = 20;

/** Distance Between Boxes */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
		double centerY = getHeight()/2.0;
		double centerX = getWidth()/2.0;
		
		GRect progBox = new GRect(centerX, centerY, BOX_WIDTH, BOX_HEIGHT);
		/**GRect graphBox = new GRect(centerX, centerY, BOX_WIDTH, BOX_HEIGHT);
		GRect consoleBox = new GRect(centerX, centerY, BOX_WIDTH, BOX_HEIGHT);
		GRext dialogBox = new GRect(centerX, centerY, BOX_WIDTH, BOX_HEIGHT);
		*/
		
		GLabel prog = new GLabel("Program", progBox.getX(), progBox.getY()+BOX_HEIGHT);
		prog.move(prog.getWidth()/2, -prog.getAscent()/2);
		
		/**GLabel consoleProg = new GLabel("ConsoleProgram", progBox.getX(), progBox.getY()); 
		GLabel graphProg = new GLabel("GraphicsProgram", centerX-50, centerY+30);
		GLabel dialogProg = new GLabel("DialogProgram", centerX+250, centerY+30);
		*/
		add(progBox);
		add(prog);
		/**add(graphBox);
		add(consoleBox);
		add(dialogBox);
		add(graphProg);
		add(consoleProg);
		add(dialogProg);
*/
}}

