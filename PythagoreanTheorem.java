/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
	println("Enter values to compute the Pythagorean theorem.");
	double a = readDouble("a: ");
	double b = readDouble("b: ");
	double c = Math.sqrt(Math.pow(a,2.0) + Math.pow(b,2.0));
	println("c = " + c);
	}
}
