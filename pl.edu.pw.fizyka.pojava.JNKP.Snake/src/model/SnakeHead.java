package model;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

import constants.Constants;
import images.Image;
import images.ImageFactory;

public class SnakeHead extends Sprite
{
	public SnakeHead()
	{
		initialize();
	}
	
	private void initialize()
	{
		ImageIcon imageIcon = ImageFactory.createImage(Image.SNAKEHEAD);
		setImage(imageIcon.getImage());
		
		int start_x = Constants.BOARD_WIDTH/2-Constants.SNAKEHEAD_WIDHT/2;
		int start_y = Constants.BOARD_HEIGHT/2-Constants.SNAKEHEAD_HEIGHT/2;
		
		setX(start_x);
		setY(start_y);
		
	}
	@Override
	public void move()
	{
		x += dx;
		y += dy;
		
		if(x<0)
		{
			x=0;
		}
		if(x>=Constants.BOARD_WIDTH-Constants.SNAKEHEAD_WIDHT)//to nie dziala poprawnie
			//musze to przemyslec
		{
			x=750-Constants.SNAKEHEAD_WIDHT;
		}
		
		if(y<0)
		{
			y=0;
		}
		if(y>=Constants.BOARD_HEIGHT-Constants.SNAKEHEAD_HEIGHT)
		{
			y=750-Constants.SNAKEHEAD_HEIGHT;
		}
	}
	
	public void keyPressed(KeyEvent e)
	{
		int pushbutton = e.getKeyCode();
		/*
		 * w=87
		 * a=65
		 * s=83
		 * d=68
		 */
		
		if(pushbutton==KeyEvent.VK_LEFT)
		{
			dx = -5;
		}
		if(pushbutton==KeyEvent.VK_RIGHT)
		{
			dx = 5;
		}
		if(pushbutton==KeyEvent.VK_DOWN)
		{
			dy = 5;
		}
		if(pushbutton==KeyEvent.VK_UP)
		{
			dy = -5;
		}
	}
}
