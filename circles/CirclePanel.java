/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-02: ACTIVITY 3. 
 * 			The purpose of this project is to move Circles with Mouse.
 * Student Name: Thao Truong
 * Description of the class: creates and draws a circle of a specific size and 
 * color.Each circle replaces the one before it on the JPanel
 * Date Created: 4/26/2018
 * *******************************************************/package circles;
import java.awt.Point;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
public class CirclePanel extends JPanel implements MouseListener,MouseMotionListener {
	private static final long serialVersionUID = 1L;
	private Circle circle;
	private Point p;    //import Point object
	// ****************************************************
	// * Sets up this Panel and Listener for mouse events.
	// * Panel listens for mouse events
	// ****************************************************
	public CirclePanel() {
		// register panel as a MouseListener and MouseActionListener
		addMouseListener(this);
		addMouseMotionListener(this);
	
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
	// * Provides empty definitions for the unused
	// * mouse methods of the Listener interface.
	// ****************************************************
	public void mouseClicked(MouseEvent event) {
	}
	public void mouseEntered(MouseEvent event) {	
	}
	public void mouseExited(MouseEvent event) {
	}
	public void mouseMoved(MouseEvent event) {
		
	}
	public void mouseReleased(MouseEvent event) {
	}

	// ****************************************************
	// * Create new circle at the location, whenever the
	// * mouse button is pressed and repaints.
	// ****************************************************
	public void mousePressed(MouseEvent event) {
		p = event.getPoint();
		circle = new Circle(p);
		repaint();
	}
	//move the location of the circle to a new place that is pressed by the mouse
	//drag the circle along the movement of the mouse after we press it on the window
	public void mouseDragged(MouseEvent event) {
		p = event.getPoint();
		circle = new Circle(p);
		repaint();
	}
		
}