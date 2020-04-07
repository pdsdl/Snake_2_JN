package userInterface;

import javax.swing.JFrame;

import constants.Constants;
import images.Image;
import images.ImageFactory;

public class GameMainFrame extends JFrame
{
	public GameMainFrame()
	{
		initializeLayout();
	}
	
	private void initializeLayout()
	{
		add(new GamePanel());
		
		setTitle(Constants.TITLE);
		setIconImage(ImageFactory.createImage(Image.SNAKE).getImage());
		
		pack();//dzieki temu i add(new GamePanel()) upewniamy sie, ze okno
		//bedzie w takim rozmiarze jak chcemy w GamePanel
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//to bedzie zmienione potem, na razie robimy "sztywne" okienko:
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}
}
