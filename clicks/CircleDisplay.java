/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-01: ACTIVITY 1. 
 * 			The purpose of this project is to draw Circles with Mouse Clicks.
 * Student Name: Thao Truong
 * Description of the class: create Circle code which specifies the location to draw a circle. 
 * Date Created: 4/24/2018
 * *******************************************************/
package clicks;

import javax.swing.JFrame;

public class CircleDisplay {
	// ****************************************************
	// * Creates and displays the window frame
	// ****************************************************
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;
	private static final int LEFT_X = 750;
	private static final int TOP_Y = 100;

	public CircleDisplay() {
		CirclePanel panel = new CirclePanel();
		JFrame frame = new JFrame("Circle Display");
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new CircleDisplay();
	}
}