/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-01: ACTIVITY 2. 
 * 			The purpose of this project is to draw Rectangles with Mouse Movements.
 * Student Name: Thao Truong
 * Description of the class: creates listeners and rectangles  with the color 
 * 						and size indicated at the specified location which is triggered by mouse movements.
 * Date Created: 4/24/2018
 * *******************************************************/

package drags;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class DragPanel extends JPanel implements MouseMotionListener {
	private static final long serialVersionUID = 1L;

	// ****************************************************
	// * Sets up this Panel and Listener for mouse events.
	// * Panel listens for mouse events
	// ****************************************************
	public DragPanel() {
		// register panel as a MouseMotionListener
		addMouseMotionListener(this);
	}

	// ****************************************************
	// * Create new circle at the location, whenever the
	// * mouse button is pressed and repaints.
	// ****************************************************
	public void mouseDragged(MouseEvent event) {
		// place when mouse is dragged in panel instructions here
		int x = event.getX();
		int y = event.getY();
		Graphics pen = getGraphics();
		pen.setColor(Color.RED);
		pen.drawRect(x, y, 50, 50);
	}

	// ****************************************************
	// * Provides empty definitions for the unused
	// * mouse methods of the Listener interface.
	// ****************************************************
	public void mouseMoved(MouseEvent event) {
		// place when mouse is moved in panel instructions here
		int x = event.getX();
		int y = event.getY();
		Graphics pen = getGraphics();
		pen.setColor(Color.BLUE);
		pen.drawRect(x, y, 50, 50);
	}
}