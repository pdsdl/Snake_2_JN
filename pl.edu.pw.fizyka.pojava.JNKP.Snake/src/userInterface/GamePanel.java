package userInterface;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.Timer;//1:53

import constants.Constants;
import images.Image;
import images.ImageFactory;

public class GamePanel extends JPanel
{
	private ImageIcon backgroundImage;
	private Timer timer;
	
	public GamePanel()
	{
		initializeVariables();
		initializeLayout();
	}
	
	private void initializeVariables()
	{
		this.backgroundImage = ImageFactory.createImage(Image.BACKGROUND); 
		this.timer = new Timer(Constants.GAME_SPEED,new GameLoop(this));
	}

	private void initializeLayout()
	{
		setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
	}
	
	@Override
	protected void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(backgroundImage.getImage(),0,0,null);
	}

	public void doOneLoop()
	{
		// TODO Auto-generated method stub
		
	}
}
