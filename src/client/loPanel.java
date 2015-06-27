package client;

import java.awt.*;
import javax.swing.*;

public class loPanel extends JPanel{
	JLabel title ;
	JLabel subtitle ;
	JLabel user;
	JLabel password;


	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(new Color(98,98,102, 150));
		g.fillRect(100, 100, 620, 500);
		
		
		title = new JLabel("歡迎登入！");
		title.setBounds(340,250, 800, 150);		
		title.setFont(new java.awt.Font("Dialog", 1, 30));	
		title.setForeground(new Color(255,155,155));
		
		subtitle = new JLabel("快快享受免廣告觀看影片吧～～～");
		subtitle.setBounds(190,300, 800, 150);
		subtitle.setFont(new java.awt.Font("Dialog", 1, 30));
		subtitle.setForeground(new Color(255,155,155));
		
		add(title);
		add(subtitle);
		
		
		
		
	}
}
