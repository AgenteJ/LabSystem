package labSystem;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import component.Util;

public class Loading extends JPanel{
	
	ImageIcon gifLoading;
	ImageIcon back;
	
	public Loading() {
		
		gifLoading = new ImageIcon("res\\loading\\loading1.gif");
		back = new ImageIcon("res\\loading\\back.png");
	}
	
	protected void paintComponent(Graphics g){
		
		// Fundo
		Image img = Util.menuBackGround.getImage();
		g.drawImage(img, 0, 0, getWidth() , getHeight(), this);
		
		// Logo
		img = Util.logo.getImage();
		g.drawImage(img, Util.DEFAULT_SCREEN_WIDTH - 610, 100, 300, 200, this);
		
		// Gif carregando
		img = back.getImage();
		g.drawImage(img, Util.DEFAULT_SCREEN_WIDTH / 2 - 303, Util.DEFAULT_SCREEN_HEIGHT - 253, 606, 40, this);
		
		img = gifLoading.getImage();
		g.drawImage(img, Util.DEFAULT_SCREEN_WIDTH / 2 - 300, Util.DEFAULT_SCREEN_HEIGHT - 250, 600, 35, this);
	}
	
}
