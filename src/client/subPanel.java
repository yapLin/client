package client;

import java.awt.*;
import javax.swing.*;

public class subPanel extends JPanel{
	JLabel top ;
	topPhoto top3;
	Image im1, im2, im3;
	String[] name;
	
	public subPanel(String[] name, Image im1, Image im2, Image im3)
	{
		this.im1=im1;
		this.im2=im2;
		this.im3=im3;
		this.name = name;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(new Color(98,98,102, 150));
		g.fillRect(100, 100, 620, 500);
		
		top = new JLabel("本月最Hot影片 Top 3");
		top.setBounds(230,100, 800, 150);
		top.setFont(new java.awt.Font("Dialog", 1, 35));  
		top.setForeground(new Color(255,155,155));
		add(top);
		
		top3 = new topPhoto(name, im1, im2, im3);
		top3.setBounds(0,0,1000,700);
		add(top3);
		
		
	}
}
