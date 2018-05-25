/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-01: ACTIVITY 1. 
 * 			The purpose of this project is to draw Circles with Mouse Clicks.
 * Student Name: Thao Truong
 * Description of the class: creates a circle at the specified location, with the color
and size indicated. 
 * Date Created: 4/24/2018
 * *******************************************************/
package clicks;

import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	private int centerX, centerY;
	private int radius;
	private Color color;

	// ****************************************************
	// * Creates a circle at location (x, y)
	// ****************************************************
	public Circle(int x, int y) {
		radius = 25;
		color = new Color(0, 135, 25);
		centerX = x;
		centerY = y;
	}

	// ****************************************************
	// * Draws a circle with the Graphics object "pen"
	// ****************************************************
	public void draw(Graphics pen) {
		int x = centerX - radius;
		int y = centerY - radius;
		pen.setColor(color);
		pen.fillOval(x, y, 2 * radius, 2 * radius);
	}
}
