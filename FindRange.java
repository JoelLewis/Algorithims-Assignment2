/*
 * File: FindRange.java
 * Name: 
 * Section Leader: 
 * --------------------
 * This file is the starter file for the FindRange problem.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	private static final int SENTINEL =0;
	
	public void run() {
int smallest;
int largest;
int i = 0;

while (true){
int val = readInt("? ");
if (val==SENTINEL){break;}
else if (i==0){largest = val; smallest = val;}
else if (val > largest) {largest = val;i++;}
else if (val < smallest) {smallest = val; i++;}
}
if(i == 0) {println("You have not entered any values");}
else {println("smallest: "+smallest);println("largest: "+largest);}
}}

