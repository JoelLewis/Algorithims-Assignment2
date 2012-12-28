/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	public void run() {
	double centerY = getHeight()- BRICK_HEIGHT;
	double centerX = getWidth();
	double startX = centerX - (BRICK_WIDTH*BRICKS_IN_BASE/2);

	for(int rowHeight = 0; rowHeight <= BRICKS_IN_BASE; rowHeight++){
		for(int brickInRowNum = 0; brickInRowNum <= rowHeight; brickInRowNum++){
			GRect brick = new GRect(startX + (brickInRowNum*BRICK_WIDTH) + (rowHeight*BRICK_WIDTH),
					centerY + (rowHeight*BRICK_HEIGHT),Pyramid.BRICK_WIDTH,Pyramid.BRICK_HEIGHT);
			add(brick);	
		}		
	}}}
		
