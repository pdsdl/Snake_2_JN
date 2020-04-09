package model;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import constants.Constants;
import images.Image;
import images.ImageFactory;

public class SnakeHead extends Sprite {
	public SnakeHead() {
		initialize();
	}

	private void initialize() {
		ImageIcon imageIcon = ImageFactory.createImage(Image.SNAKEHEAD);
		//System.out.println(imageIcon.getIconHeight()); //debug
		setImage(imageIcon.getImage());

		int start_x = Constants.BOARD_WIDTH / 2 - Constants.SNAKEHEAD_WIDTH / 2;
		int start_y = Constants.BOARD_HEIGHT / 2 - Constants.SNAKEHEAD_HEIGHT / 2;

		setX(start_x);
		setY(start_y);

	}

	@Override
	public void move() {
		x += dx;
		y += dy;

		if (x < 0) {
			x = 0;
			setDead(true);
		}

		if (x > (Constants.BOARD_WIDTH - Constants.SNAKEHEAD_WIDTH)) {
			x = Constants.BOARD_WIDTH - Constants.SNAKEHEAD_WIDTH;
			setDead(true);
		}

		if (y < 0) {
			y = 0;
			setDead(true);
		}
		if (y > Constants.BOARD_HEIGHT - Constants.SNAKEHEAD_HEIGHT) {
			y = Constants.BOARD_HEIGHT - Constants.SNAKEHEAD_HEIGHT;
			setDead(true);
		}
	}

	public void keyPressed(KeyEvent e) {
		int pushbutton = e.getKeyCode();
		/*
		 * w=87 a=65 s=83 d=68
		 */

		if (pushbutton == KeyEvent.VK_LEFT) {
			dx = -25;
			dy = 0;
//			 final double rads = Math.toRadians(90);
//			 .rotate(rads,0, 0);
		}
		if (pushbutton == KeyEvent.VK_RIGHT) {
			dx = 25;
			dy = 0;
		}
		if (pushbutton == KeyEvent.VK_DOWN) {
			dy = 25;
			dx = 0;
		}
		if (pushbutton == KeyEvent.VK_UP) {
			dy = -25;
			dx = 0;
		}
	}
}
