/*********************************************************
 * Program Name: CSC 143
 * Project: LAB EX-02: ACTIVITY 3. 
 * 			The purpose of this project is to move Circles with Mouse.
 * Student Name: Thao Truong
 * Description of the class: place a Point object in the CirclePanel class to handle the access between methods.
 * 							The class implement KeyListner to handle Keyboard events
 * 							Modify the code in CirclePanel.java and Circle.java, so that a circle is drawn on the panel and moves left, right, up or down depending on the arrow keys pressed on the keyboard. 
 * Date Created: 4/30/2018
 * Date Updated: 4/30/2018
 * *******************************************************/
package strokes;

import java.awt.Point;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CirclePanel extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;
	private Circle circle;
	Point p;

	// ****************************************************
	// * Sets up this Panel and Listener for key events.
	// * Panel listens for key events
	// ****************************************************
	public CirclePanel() {
		// create an initial point (200 pixels, 100 pixels)
		p = new Point(200,100);
		// create a new circle with point
		circle = new Circle(p);
		//register listenner
		addKeyListener(this);
		setFocusable(true);
	}

	// ****************************************************
	// * Draws the current circle, if any
	// ****************************************************
	public void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		if (circle != null)
			circle.draw(pen);
	}

	// ****************************************************
	// * Moves the circle whenever the key button
	// * is pressed and repaints.
	// ****************************************************
	public void keyPressed(KeyEvent event) {         
		int keyPress = event.getKeyCode();
		if (keyPress == KeyEvent.VK_UP) {           //control for up key codes
			up();
		}else if(keyPress == KeyEvent.VK_DOWN){     //control for down key codes
			down();
		}else if(keyPress == KeyEvent.VK_RIGHT){	//control for right key codes
			right();
		}else if(keyPress == KeyEvent.VK_LEFT){		//control for left key codes
			left();
		}
		// create controls for down, left and right key codes
		repaint();
	}
	// create methods for down, left and right movements
	// ****************************************************
	public void up() {
		p.x += 0;
		p.y -= 10;
		circle.move(p);
	}
	public void down() {
		p.x += 0;
		p.y += 10;
		circle.move(p);
	}
	public void right() {
		p.x += 10;
		p.y += 0;
		circle.move(p);
	}
	public void left() {
		p.x -= 10;
		p.y += 0;
		circle.move(p);
	}
	
	// *Provides empty definitions for the unused
	// * key methods of the Listener interface.
	// ****************************************************
	public void keyTyped(KeyEvent event) {
	}

	public void keyReleased(KeyEvent event) {
	}
}