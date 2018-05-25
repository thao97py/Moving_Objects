/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-01: ACTIVITY 2. 
 * 			The purpose of this project is to draw Circles with Mouse Clicks.
 * Student Name: Thao Truong
 * Description of the class:creates the general code for displaying a panel in a window frame. 
 * Date Created: 4/24/2018
 * *******************************************************/
package drags;
import javax.swing.JFrame;

public class DragDisplay {
	// ****************************************************
	// * Creates and displays the window frame
	// ****************************************************
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;
	private static final int LEFT_X = 750;
	private static final int TOP_Y = 100;

	public DragDisplay() {
		DragPanel panel = new DragPanel();
		JFrame frame = new JFrame("Drag Display");
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new DragDisplay();
	}
}