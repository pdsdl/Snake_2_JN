package app;

import java.awt.EventQueue;

import userInterface.GameMainFrame;

public class App
{
	public static void main(String[] args)
	{
		EventQueue.invokeLater( () ->
		{
			new GameMainFrame();
		});
	}
}
