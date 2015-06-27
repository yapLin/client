package client;

import java.awt.*;
import javax.swing.*;

public class bgPanel extends JPanel{
	Image im;
	public bgPanel(Image im)
	{
		this.im=im;
		this.setOpaque(true);
	}
	
	//Draw the back ground.
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);
		
	}

}
