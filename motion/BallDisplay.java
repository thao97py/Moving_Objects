/*********************************************************
 * Program Name: CSC 143
 * Project: LAB-5: Animation and Events
 * Student Name: Thao Truong
 * Description:The class is used to create the display window to presents an animation that displays a bouncing ball 
 * in a panel. The program uses a Timer class to animate the ball bouncing.Animation involves painting and repainting 
 * the same scene, giving the viewer the illusion of a moving object. Two repeated actions can accomplish this
 *		o drawing the ball
 *		o moving the ball
 *		
 * Date Created: 5/7/2018
 * Date Updated: 5/7/2018 
 * *******************************************************/

package motion;
import javax.swing.JFrame;
public class BallDisplay {
	//****************************************************
	//* Creates and displays the display frame
	//****************************************************
	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	public static final int LEFT_X = 750;
	public static final int TOP_Y = 100;
	public BallDisplay() {
	BallPanel panel = new BallPanel();
	JFrame frame = new JFrame("Ball Display");
	frame.add(panel);
	frame.setSize(WIDTH, HEIGHT);
	frame.setLocation(LEFT_X, TOP_Y);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}
	public static void main(String[] args) {
	new BallDisplay();
	}
	}
