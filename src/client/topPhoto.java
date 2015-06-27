package client;

import java.awt.*;
import javax.swing.*;

public class topPhoto extends JPanel{
	Image im1, im2, im3;
	JLabel t1, t2, t3;
	String[] name;
	public topPhoto(String[] name, Image im1, Image im2, Image im3)
	{
		this.im1=im1;
		this.im2=im2;
		this.im3=im3;
		this.name = name;
		this.setOpaque(true);
	}
	
	//Draw the back ground.
	public void paintComponent(Graphics g)
	{
		
		super.paintComponents(g);
		g.drawImage(im1,150,270,150,150,this);
		g.drawImage(im2,330,270,150,150,this);
		g.drawImage(im3,510,270,150,150,this);
		
		t1 = new JLabel(name[0]);
		t2 = new JLabel(name[1]);
		t3 = new JLabel(name[2]);
		
		t1.setBounds(150,390,150,150);
		t1.setFont(new java.awt.Font("Dialog", 1, 35));  
		t1.setForeground(new Color(255,155,155));
		add(t1);
		
		t2.setBounds(330,390,150,150);
		t2.setFont(new java.awt.Font("Dialog", 1, 35));  
		t2.setForeground(new Color(255,155,155));
		add(t2);
		
		t3.setBounds(510,390,150,150);
		t3.setFont(new java.awt.Font("Dialog", 1, 35));  
		t3.setForeground(new Color(255,155,155));
		add(t3);
		
	}
}
