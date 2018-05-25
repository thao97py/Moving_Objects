/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-01: ACTIVITY 1. 
 * 			The purpose of this project is to draw Circles with Mouse Clicks.
 * Student Name: Thao Truong
 * Description of the class: creates the general code for displaying a panel in a window frame. 
 * Date Created: 4/24/2018
 * *******************************************************/
package clicks;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CirclePanel extends JPanel implements MouseListener {
	private static final long serialVersionUID = 1L;
	private Circle circle;

	// ****************************************************
	// * Sets up this Panel and Listener for mouse events.
	// * Panel listens for mouse events
	// ****************************************************
	public CirclePanel() {
		// register panel as a MouseListener
		addMouseListener(this);
	}

	// ****************************************************
	// * Draws the current circle, if any
	// ****************************************************
	public void paintComponent(Graphics pen) {
		// check if circle is empty, if not draw circle
		super.paintComponent(pen);
		if (circle!= null)
			circle.draw(pen);
	}

	// ****************************************************
	// * Create new circle at the location, whenever the
	// * mouse button is pressed and repaints.
	// ****************************************************
	public void mouseClicked(MouseEvent event) {
		// place mouse click instructions here
		int x = event.getX();
		int y = event.getY();
		circle = new Circle(x,y);
		repaint();
	}

	public void mouseEntered(MouseEvent event) {
		// place when mouse enters panel instructions here
		setBackground (Color.PINK);
	}

	public void mouseExited(MouseEvent event) {
		// place when mouse exits panel instructions here
		setBackground(Color.YELLOW);
	}

	// ****************************************************
	// * Provides empty definitions for the unused
	// * mouse methods of the Listener interface.
	// ****************************************************
	public void mousePressed(MouseEvent event) {
		setBackground(Color.ORANGE);
	}

	public void mouseReleased(MouseEvent event) {
	}
	
		
	};
	
