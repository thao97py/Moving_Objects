/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-03: ACTIVITY 5. 
 * 			The purpose of this project is to create the program that moves Circles with Key Pressed.
 * Student Name: Thao Truong
 * Description of the class: Modify Circle class constructor to take a Point object, create and draw a circle of a specific size and color.
 * 							And each circle will replaces the one before it.
 * Date Created: 4/30/2018
 * Date Updated: 4/30/2018
 * *******************************************************/
package strokes;
import java.awt.Point;
import java.awt.Color;
import java.awt.Graphics;

public class Circle {
	private int centerX, centerY;
	private int radius;
	private Color color;
	

	// ****************************************************
	// * Creates a circle at with center of the circle is defined by object Point
	// ****************************************************
	public Circle(Point p) {     //take the Point object as a argument
		radius = 25;
		color = Color.RED;
		centerX = p.x;
		centerY = p.y;
	}

	// ****************************************************
	// * Draws a circle with the Graphics object "pen"
	// ****************************************************
	public void draw(Graphics pen) {
		int x = centerX - radius;           //location of the center point of the circle on the x-axis
		int y = centerY - radius;           //location of the center point of the circle on the y-axis
		pen.setColor(color);				//set color for the circle, which is red
		pen.fillOval(x, y, 2 * radius, 2 * radius);     //paint color to the circle
	}
	
	//translate the circle with the coordinates specified by the Point object
	public void move(Point p) {
		centerX = p.x;
		centerY = p.y;	
	}

}
