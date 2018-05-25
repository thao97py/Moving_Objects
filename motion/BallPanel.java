/*********************************************************
 * Program Name: CSC 143
 * Project: LAB-5: Animation and Events
 * Student Name: Thao Truong
 * Description:The class uses a Timer class to animate the ball bouncing.Animation involves painting and repainting the same scene, giving the
 * viewer the illusion of a moving object. Two repeated actions can accomplish this
 *		o drawing the ball
 *		o moving the ball
 * The major steps in the class are:
 * 	 + Define a subclass of JPanel named BallPanel.
 * 	 + Define an inner class of BallPanel named Listener that listens for KeyEvent(s),
 *	 + MouseEvent(s) and ActionEvents(s).
 * 	 + The animation will stop when the mouse (left click on touch pad) is pressed and resumes when the mouse is released.
 *   + Pressing the tap and shift arrow keys increases or decreases the animation speed.
 *   + Pressing the up, down, left and right arrow keys changes the ball direction during the animation to only move in one direction.
 *   + Pressing the control key advances the ball in a two-dimensional plane.
 * Date Created: 5/7/2018
 * Date Updated: 5/7/2018 
 * *******************************************************/
package motion;

import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class BallPanel extends JPanel {
	//data members
	private static final long serialVersionUID = 1L;
	private Timer timer;
	private double delta = 2.0;
	private double x = 0.0;
	private double y = 0.0;
	private double dx = delta;
	private double dy = delta;
	private double radius = 40.0;
	private Listener listener;

	public BallPanel() {
		listener = new Listener();
		timer = new Timer(5, listener);
		addKeyListener(listener);
		addMouseListener(listener);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(Color.BLUE);
		Ellipse2D ball = new Ellipse2D.Double(x, y, radius,radius);
		g2D.fill(ball);
	}
	public class Listener implements ActionListener, MouseListener, KeyListener {
		public void actionPerformed(ActionEvent event) {
			move();
			repaint();
		}

		// ****************************************************
		// * Check the boundaries of the display
		// ****************************************************
		public void move() {
			if (x<0 || x>BallDisplay.WIDTH -radius)
				dx = -dx;
			if (y<0 || y>BallDisplay.HEIGHT -3*radius)
				dy = -dy;
			
			x+=dx;
			y+=dy;
		}

		// ****************************************************
		// * Stops Timer when mouse is pressed
		// ****************************************************
		public void mousePressed(MouseEvent event) {
			timer.stop();    ////stop timer so that no more events will occur
		}

		// ****************************************************
		// * Resumes Timer when mouse is released
		// ****************************************************
		public void mouseReleased(MouseEvent event) {
			timer.start();  //start timer to generate events
		}

		// ****************************************************
		// * Provides empty definitions for the unused
		// * mouse methods of the Listener interface.
		// ****************************************************
		public void mouseEntered(MouseEvent event) { }
		public void mouseExited(MouseEvent event) {}
		public void mouseClicked(MouseEvent event) { }
		//****************************************************
		//* Moves the ball whenever the
		//* key button is pressed and repaints.
		//****************************************************
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
			else if(keyPress == KeyEvent.VK_TAB){		//control for tab key codes
				increase();
			}
			else if(keyPress == KeyEvent.VK_SHIFT){		//control for shift key codes
				decrease();
			}
			else if(keyPress == KeyEvent.VK_CONTROL){		//control for control key codes
				plane();
			}
			// create controls for up,down, left,right, shift and control key codes
			repaint();
		}
		// Move the ball up
		public void up() {    
			dx=0;
			dy =-delta;
		}
		// Move the ball down
		public void down() {
			dx=0;
			dy = delta;
		}
		// Move the ball to the left of the panel
		public void left() {
			dy=0;
			dx =-delta;
		}
		// Move the ball to the right of panel
		public void right() {
			dy=0;
			dx = delta;
		}
		// Increase the speed of the ball
		public void increase() {
			dx *= 2;
			dy *=2;
		}
		// Decrease the speed of the ball
		public void decrease() {
			dx /= 2;
			dy /=2;
		}
		//  Advance the ball in the display by the incremental amount delta in both the x and y direction
		public void plane() {
			dx=delta;
			dy=delta;
		}

		// ****************************************************
		// * Provides empty definitions for the unused
		// * key methods of the Listener interface.
		// ****************************************************
		public void keyTyped(KeyEvent event) {}
		public void keyReleased(KeyEvent event) {}
	}

}
